package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.Node;

public class GenerableFactory {
    /**
     * Create and returns an instance of Generable depending on the symbol of the given node
     *
     * @param node corresponding AST node
     * @return generable associated to the node's symbol
     */
    public static Generable getGenerable(Node node) {
        Generable g;

        switch (node.getNodeSymbol()) {
            case PROGRAM:
                g = new Program(node);
                break;

            case FUNCTION:
                g = new FunctionDefinition(node);
                break;

            case RETURN:
                g = new ReturnStatement(node);
                break;

            case ASSIGN:
                g = new Assignation(node);
                break;

            case CALL:
                g = new FunctionCall(node);
                break;

            case IF:
                g = new IfStatement(node);
                break;

            case WHILE:
                g = new WhileLoop(node);
                break;

            case READ:
            case WRITE:
                g = new Intio(node);
                break;

            default:
                g = new Expression(node);
                break;
        }

        return g;
    }
}
