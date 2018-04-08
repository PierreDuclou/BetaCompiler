package ul.miage.l3.compilation.groupe_i.ast;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents an AST inner node (that has children)
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class InnerNode extends Node {
    /**
     * Children of the node
     */
    LinkedList<Node> children = new LinkedList();

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     */
    public InnerNode(NodeSymbol NODE_SYMBOL) {
        super(NODE_SYMBOL);
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param symbolsTableKey symbolsTableKey
     */
    public InnerNode(NodeSymbol NODE_SYMBOL, int symbolsTableKey) {
        super(NODE_SYMBOL, symbolsTableKey);
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param symbolsTableKey symbolsTableKey
     * @param children children
     */
    public InnerNode(NodeSymbol NODE_SYMBOL, int symbolsTableKey, LinkedList<Node> children) {
        super(NODE_SYMBOL, symbolsTableKey);
        this.children = children;
    }

    /**
     * Add the given node to the children list
     *
     * @param node node to add
     */
    public void addChild(Node node) {
        children.addLast(node);
    }

    /**
     * Add the given node list to the children list
     *
     * @param nodes nodes to add
     */
    public void addChild(List<Node> nodes) {
        children.addAll(nodes);
    }

    /**
     * String representation of the node
     *
     * @return string representing the node
     */
    @Override
    public String toString() {
        return "InnerNode{" +
                "NODE_SYMBOL=" + NODE_SYMBOL +
                ", symbolsTableKey=" + symbolsTableKey +
                ", children=" + children +
                '}';
    }
}
