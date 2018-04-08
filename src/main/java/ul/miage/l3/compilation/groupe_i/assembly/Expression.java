package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.LeafNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;

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
                "POP(R1)";

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

    @Override
    public String generate() {
        String ret = "";

        switch (node.getNodeSymbol()) {
            case CONST:
                LeafNode leaf = (LeafNode) node;
                ret += "CMOVE(" + leaf.getValue() + ", R0)\n" + "PUSH(R0)\n";
                break;

            case VARIABLE:
                ret += "LD(" + ((LeafNode) node).getValue() + ", R0)\nPUSH(R0)\n";

            case CALL:
                ret += new ReturnStatement(node).generate();
                break;

            case WRITE:
            case READ:
                ret += new Intio(node).generate();

            default:
                System.out.println(node.getNodeSymbol());
                ret += generateExpression();
        }

        return ret;
    }
}
