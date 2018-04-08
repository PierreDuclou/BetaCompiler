package ul.miage.l3.compilation.groupe_i.ast;

import ul.miage.l3.compilation.groupe_i.symbols.GlobalVariable;
import ul.miage.l3.compilation.groupe_i.symbols.LocalVariable;
import ul.miage.l3.compilation.groupe_i.symbols.Symbol;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

/**
 * Represents an AST leaf node (that does not have any children)
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
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
        Symbol sym = SymbolsTable.getInstance().get(symbolsTableKey);

        if (sym instanceof GlobalVariable)
            value = ((GlobalVariable) sym).getValue();

        if (sym instanceof LocalVariable)
            value = ((LocalVariable) sym).getValue();

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
