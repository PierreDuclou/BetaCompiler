package ul.miage.l3.compilation.groupe_i.ast;

public abstract class Node {
    NodeSymbol NODE_SYMBOL;
    int symbolsTableKey;

    public Node(NodeSymbol NODE_SYMBOL) {
        this.NODE_SYMBOL = NODE_SYMBOL;
    }

    public Node(NodeSymbol NODE_SYMBOL, int symbolsTableKey) {
        this.NODE_SYMBOL = NODE_SYMBOL;
        this.symbolsTableKey = symbolsTableKey;
    }
}
