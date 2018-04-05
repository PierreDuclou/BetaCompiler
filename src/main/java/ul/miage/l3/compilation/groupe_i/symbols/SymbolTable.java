package ul.miage.l3.compilation.groupe_i.symbols;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<Integer, Symbol> symbols;
    private static SymbolTable instance = new SymbolTable();

    /**
     * Constructor
     */
    private SymbolTable() {
        symbols = new HashMap();
    }

    /**
     * Return the current instance
     *
     * @return instance
     */
    public static SymbolTable getInstance() {
        return instance;
    }

    /**
     * Add the given symbol to the symbols map
     *
     * @param key key of the symbol
     * @param symbol symbol to add
     */
    public void add(int key, Symbol symbol) {
        symbols.put(key, symbol);
    }
}