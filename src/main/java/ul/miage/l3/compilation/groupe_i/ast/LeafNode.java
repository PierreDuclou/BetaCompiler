package ul.miage.l3.compilation.groupe_i.ast;

public class LeafNode extends Node {
    /**
     * Value of the leaf (handling constant node)
     */
    private int value;

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     */
    public LeafNode(NodeSymbol NODE_SYMBOL) {
        super(NODE_SYMBOL);
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param value value
     */
    public LeafNode(NodeSymbol NODE_SYMBOL, String value) {
        super(NODE_SYMBOL);
        this.value = Integer.parseInt(value);
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param symbolsTableKey symbolsTableKey
     */
    public LeafNode(NodeSymbol NODE_SYMBOL, int symbolsTableKey) {
        super(NODE_SYMBOL, symbolsTableKey);
    }

    /**
     * Constructor
     *
     * @param NODE_SYMBOL NODE_SYMBOL
     * @param symbolsTableKey symbolsTableKey
     * @param value value
     */
    public LeafNode(NodeSymbol NODE_SYMBOL, int symbolsTableKey, String value) {
        super(NODE_SYMBOL, symbolsTableKey);
        this.value = Integer.parseInt(value);
    }

    /**
     * Getter : value;
     *
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "LeafNode{" +
                "value=" + value +
                ", NODE_SYMBOL=" + NODE_SYMBOL +
                ", symbolsTableKey=" + symbolsTableKey +
                '}';
    }
}
