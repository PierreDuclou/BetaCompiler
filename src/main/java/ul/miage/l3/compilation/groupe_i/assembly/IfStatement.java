package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;

import java.util.LinkedList;

/**
 * Represents a function in symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class IfStatement extends Generable {
    /**
     * Number of instances
     */
    private static int counter = 0;

    /**
     * [condition expression, then block, else block]
     */
    LinkedList<Node> children;

    /**
     * Constructor
     *
     * @param node node
     */
    public IfStatement(Node node) {
        super(node);
        children = (LinkedList)((InnerNode) node).getChildren().clone();
    }

    /**
     * Generate an inner block of instructions (then/else)
     *
     * @param header
     * @return
     */
    private String generateNextBlock(String header) throws Exception {
        String ret = header;

        if (children.size() > 0) {
            for (Node thenInstruction: ((InnerNode) children.poll()).getChildren()) {
                ret += GenerableFactory.getGenerable(thenInstruction).generate();
            }
        }

        return ret;
    }

    @Override
    public String generate() throws Exception {
        return "\nif_" + counter + ":\n" +
                GenerableFactory.getGenerable(children.poll()).generate() +
                "POP(R0)\nBF(R0, else_" + counter + ")\n" +
                generateNextBlock("\n| then:\n") +
                "BR(endif_" + counter + ")\n" +
                "\nelse_" + counter + ":\n" +
                generateNextBlock("") + "endif_" + counter++ + ":\n";
    }
}
