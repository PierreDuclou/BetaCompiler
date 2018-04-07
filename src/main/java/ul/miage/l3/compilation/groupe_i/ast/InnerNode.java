package ul.miage.l3.compilation.groupe_i.ast;

import java.util.LinkedList;

public class InnerNode extends Node {
    LinkedList<Node> children = new LinkedList();

    public InnerNode(NodeSymbol NODE_SYMBOL) {
        super(NODE_SYMBOL);
    }

    public void addChild(Node node) {
        children.addLast(node);
    }
}
