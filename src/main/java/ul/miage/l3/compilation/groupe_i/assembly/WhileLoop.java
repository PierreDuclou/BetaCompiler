package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;

import java.util.LinkedList;

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
    public String generate() {
        LinkedList<Node> children = ((InnerNode) node).getChildren();

        String ret = "\nwhile_" + counter + ":\n" +
                GenerableFactory.getGenerable(children.getFirst()).generate() +
                "POP(R0)\n" +
                "BF(R0, endwhile_" + counter + ")\n";

        for (Node n: children) {
            ret += GenerableFactory.getGenerable(n).generate();
        }

        return ret + "BR(while_" + counter + ")\nendwhile_" + (counter++) + ":\n";
    }
}
