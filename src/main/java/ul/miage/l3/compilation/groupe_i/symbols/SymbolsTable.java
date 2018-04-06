package ul.miage.l3.compilation.groupe_i.symbols;

import java.util.HashMap;

public class SymbolsTable {
    /**
     * The map of symbols
     */
    private HashMap<Integer, Symbol> symbols;

    /**
     *
     */
    private int key = 0;

    /**
     * The symbol table instance
     */
    private static final SymbolsTable INSTANCE = new SymbolsTable();

    /**
     * Constructor
     */
    private SymbolsTable() {
        symbols = new HashMap();
    }

    /**
     * Return the current INSTANCE
     *
     * @return INSTANCE
     */
    public static SymbolsTable getInstance() {
        return INSTANCE;
    }

    /**
     * Add the given symbol to the symbols map
     *
     * @param symbol symbol to add
     * @return last key added (current context)
     */
    public int add(Symbol symbol) {
        symbols.put(key, symbol);
        return key++;
    }

    /**
     * Returns the symbol associated to the given key
     *
     * @param key wanted key
     * @return symbol associated to the key
     */
    public Symbol get(int key) {
        return symbols.get(key);
    }

    /**
     * Returns a string representing the instance
     *
     * @return string representing the instance
     */
    @Override
    public String toString() {
        return "SymbolsTable{" +
                "symbols=" + symbols +
                '}';
    }
}