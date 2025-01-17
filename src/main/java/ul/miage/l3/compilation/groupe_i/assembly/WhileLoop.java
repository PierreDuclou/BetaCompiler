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
public class WhileLoop extends Generable {
    private static int counter = 0;

    /**
     * Constructor
     *
     * @param node node
     */
    public WhileLoop(Node node) {
        super(node);
    }

    @Override
    public String generate() throws Exception {
        LinkedList<Node> children = (LinkedList)((InnerNode) node).getChildren().clone();

        String ret = "\nwhile_" + counter + ":\n\n" +
                GenerableFactory.getGenerable(children.pollFirst()).generate() +
                "POP(R0)\n" +
                "BF(R0, endwhile_" + counter + ")\n";

        for (Node n: children) {
            ret += GenerableFactory.getGenerable(n).generate();
        }

        return ret + "BR(while_" + counter + ")\nendwhile_" + (counter++) + ":\n";
    }
}
