package ul.miage.l3.compilation.groupe_i.ast;

/**
 * Abstract representation of an AST node
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public abstract class Node {
    /**
     * Associated symbol (see enum NodeSymbol)
     */
    NodeSymbol NODE_SYMBOL;

    /**
     * Key that links the node to the symbols table
     */
    int symbolsTableKey;

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     */
    public Node(NodeSymbol NODE_SYMBOL) {
        this.NODE_SYMBOL = NODE_SYMBOL;
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param symbolsTableKey symbolsTableKey
     */
    public Node(NodeSymbol NODE_SYMBOL, int symbolsTableKey) {
        this.NODE_SYMBOL = NODE_SYMBOL;
        this.symbolsTableKey = symbolsTableKey;
    }
}
