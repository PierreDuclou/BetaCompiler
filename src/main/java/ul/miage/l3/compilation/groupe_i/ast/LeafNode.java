package ul.miage.l3.compilation.groupe_i.ast;

public class LeafNode extends Node {
    private int value;

    public LeafNode(NodeSymbol NODE_SYMBOL) {
        super(NODE_SYMBOL);
    }

    public LeafNode(NodeSymbol NODE_SYMBOL, String value) {
        super(NODE_SYMBOL);
        this.value = Integer.parseInt(value);
    }

    public LeafNode(NodeSymbol NODE_SYMBOL, int symbolsTableKey) {
        super(NODE_SYMBOL, symbolsTableKey);
    }

    /**
     * Getter : value;
     *
     * @return value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "LeafNode{" +
                "value=" + value +
                ", NODE_SYMBOL=" + NODE_SYMBOL +
                ", symbolsTableKey=" + symbolsTableKey +
                '}';
    }
}
