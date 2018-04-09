package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;

/**
 * Abstract generable. A generable is
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
abstract class Generable {
    /**
     * The corresponding AST node
     */
    protected Node node;

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
    public abstract String generate() throws Exception;
}