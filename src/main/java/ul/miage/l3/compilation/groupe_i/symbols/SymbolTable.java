package ul.miage.l3.compilation.groupe_i.symbols;

import java.util.HashMap;

public class SymbolTable {
    /**
     * The map of symbols
     */
    private HashMap<Integer, Symbol> symbols;

    private int key = 0;

    /**
     * The symbol table instance
     */
    private static final SymbolTable INSTANCE = new SymbolTable();

    /**
     * Constructor
     */
    private SymbolTable() {
        symbols = new HashMap();
    }

    /**
     * Return the current INSTANCE
     *
     * @return INSTANCE
     */
    public static SymbolTable getInstance() {
        return INSTANCE;
    }

    /**
     * Add the given symbol to the symbols map
     *
     * @param symbol symbol to add
     * @return last key added (current context)
     */
    public int add(Symbol symbol) {
        symbols.put(key++, symbol);
        return key;
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "symbols=" + symbols +
                '}';
    }
}