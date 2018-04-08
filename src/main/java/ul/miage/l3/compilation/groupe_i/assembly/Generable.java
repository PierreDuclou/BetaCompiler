package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;

abstract class Generable {
    /**
     * The corresponding AST node
     */
    protected Node node;

    /**
     * Retrieves and returns the closest ancestor matching the given symbol
     *
     * @param node starting node
     * @param sym wanted symbol
     * @return matching ancestor
     */
    protected InnerNode getClosestAncestor(Node node, NodeSymbol sym) {
        if (node.getParent().getNodeSymbol().equals(sym))
            return node.getParent();

        return getClosestAncestor(node.getParent(), sym);
    }

    /**
     * Constructor
     *
     * @param node node
     */
    public Generable(Node node) {
        this.node = node;
    }

    /**
     * Generates and returns assembly code corresponding to the node
     *
     * @return assembly code
     */
    public abstract String generate();
}
