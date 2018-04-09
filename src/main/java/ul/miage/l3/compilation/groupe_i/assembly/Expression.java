package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.LeafNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;
import ul.miage.l3.compilation.groupe_i.symbols.*;

public class Expression extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public Expression(Node node) {
        super(node);
    }

    /**
     * Generates and returns a sub-expression
     *
     * @return assembly code for a sub-expression
     */
    private String generateExpression() {
        String ret = new Expression(((InnerNode) node).getChildren().getFirst()).generate() +
                new Expression(((InnerNode) node).getChildren().getLast()).generate() +
                "POP(R2)\n" +
                "POP(R1)\n";

        NodeSymbol sym = node.getNodeSymbol();

        // Arithmetic operators
        if (sym.equals(NodeSymbol.ADD)) ret += "ADD(R1, R2, R3)\nPUSH(R3)\n";
        if (sym.equals(NodeSymbol.SUB)) ret += "SUB(R1, R2, R3)\nPUSH(R3)\n";
        if (sym.equals(NodeSymbol.MUL)) ret += "MUL(R1, R2, R3)\nPUSH(R3)\n";
        if (sym.equals(NodeSymbol.DIV)) ret += "DIV(R1, R2, R3)\nPUSH(R3)\n";

        // Logic operators
        if (sym.equals(NodeSymbol.LT)) ret += "CMPLT(R1, R2, R0)\nPUSH(R0)\n";
        if (sym.equals(NodeSymbol.LE)) ret += "CMPLE(R1, R2, R0)\nPUSH(R0)\n";
        if (sym.equals(NodeSymbol.EQ)) ret += "CMPEQ(R1, R2, R0)\nPUSH(R0)\n";
        if (sym.equals(NodeSymbol.GE)) ret += "CMPLE(R2, R1, R0)\nPUSH(R0)\n";
        if (sym.equals(NodeSymbol.GT)) ret += "CMPLT(R2, R1, R0)\nPUSH(R0)\n";

        return ret;
    }

    /**
     * Resolves the way to get the variable value depending on its symbol (global, local, parameter)
     *
     * @return asm instruction to get the variable value
     */
    private String resolveVariable() {
        Symbol sym = SymbolsTable.getInstance().get(node.getSymbolsTableKey());
        String ret = "";

        if (sym instanceof GlobalVariable) {
            ret += "LD(" +
                    SymbolsTable.getInstance().get(node.getSymbolsTableKey()).getId() +
                    ", R0)\nPUSH(R0)";
        } else if (sym instanceof LocalVariable) {
            ret += "GETFRAME(" + ((LocalVariable) sym).getRank() * 4 + ", R0)\n" +
                    "PUSH(R0)";
        } else {
            ret += "GETFRAME(" + -(((Parameter) sym).getRank()+3) * 4 + ", R0)\n" +
                    "PUSH(R0)";
        }

        return ret;
    }

    @Override
    public String generate() {
        String ret = "";

        switch (node.getNodeSymbol()) {
            case CONST:
                LeafNode leaf = (LeafNode) node;
                ret += "CMOVE(" + leaf.getValue() + ", R0)\n" + "PUSH(R0)\n";
                break;

            case VARIABLE:
                ret += resolveVariable() + '\n';
                break;

            case CALL:
                ret += new FunctionCall(node).generate();
                break;

            case WRITE:
            case READ:
                ret += new Intio(node).generate();
                break;

            default:
                ret += generateExpression();
                break;
        }

        return ret;
    }
}
