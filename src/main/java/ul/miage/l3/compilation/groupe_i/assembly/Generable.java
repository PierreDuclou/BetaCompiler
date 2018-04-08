package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;

abstract class Generable {
    /**
     * The corresponding AST node
     */
    protected InnerNode node;

    /**
     * Constructor
     *
     * @param node node
     */
    public Generable(InnerNode node) {
        this.node = node;
    }

    /**
     * Generates and returns assembly code corresponding to the node
     *
     * @return assembly code
     */
    public abstract String generate();
}
