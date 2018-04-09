package ul.miage.l3.compilation.groupe_i.symbols;

import ul.miage.l3.compilation.groupe_i.symbols.exceptions.UndeclaredSymbolException;

import java.util.HashMap;
import java.util.Iterator;


/**
 * Represents a symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class SymbolsTable implements Iterable<Integer> {
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
     * Resolves and returns a function key in the symbols table
     *
     * @param functionName function name
     * @return function key or null if it does not exist
     */
    public Integer getFunctionContext(String functionName) {
        for (int i: symbols.keySet()) {
            Symbol symbol = symbols.get(i);
            if (symbol.getId().equals(functionName) && symbol instanceof Function) {
                return i;
            }
        }

        return null;
    }
    

    /**
     * Returns the closest variable key in the table using the given id and context
     *
     * @param id id of the variable
     * @param context current context
     * @return key of the variable
     */
    public int getClosestVariableKey(String id, int context) throws UndeclaredSymbolException {
        int ret = -999;

        for (int i: symbols.keySet()) {
            if (symbols.get(i) instanceof Parameter) {
                Parameter tmp = (Parameter) symbols.get(i);

                if(tmp.getId().equals(id) && tmp.getContext() == context)
                    ret = i;

            } else if (symbols.get(i) instanceof LocalVariable) {
                LocalVariable tmp = (LocalVariable) symbols.get(i);

                if(tmp.getId().equals(id) && tmp.getContext() == context)
                    ret = i;

            } else {
                Symbol tmp = symbols.get(i);

                if (tmp.getId().equals(id))
                    ret = i;
            }

        }

        if (ret < 0) {
            throw new UndeclaredSymbolException("Cannot resolve symbol : \"" + id + '\"');
        }

        return ret;
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

    @Override
    public Iterator<Integer> iterator() {
        return symbols.keySet().iterator();
    }
}