package ul.miage.l3.compilation.groupe_i.ast;

/**
 * Represents an abstract syntax tree
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class AbstractSyntaxTree {
    /**
     * Root node of the tree
     */
    private InnerNode root;

    /**
     * Singleton's instance
     */
    private static AbstractSyntaxTree INSTANCE = new AbstractSyntaxTree();

    /**
     * Getter : root
     *
     * @return root
     */
    public InnerNode getRoot() {
        return root;
    }

    /**
     * Getter : INSTANCE
     *
     * @return INSTANCE
     */
    public static AbstractSyntaxTree getInstance() {
        return INSTANCE;
    }

    /**
     * Setter : root
     *
     * @param root new root
     */
    public void setRoot(InnerNode root) {
        this.root = root;
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "AbstractSyntaxTree{" +
                "root=" + root +
                '}';
    }
}
