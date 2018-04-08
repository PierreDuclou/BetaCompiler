package ul.miage.l3.compilation.groupe_i.symbols;


/**
 * Represents a symbol that has a rank and a context in symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public abstract class ContextedSymbol extends Symbol {
    /**
     * The index of the variable in the stack
     */
    protected int rank;

    /**
     * Refers to the related function's key in the symbol table
     */
    protected int context;

    /**
     * Constructor
     *
     * @param id identifier of the symbol
     * @param type type of the symbol
     * @param rank rank of the symbol in the frame stack
     * @param context function's key in the symbols table
     */
    public ContextedSymbol(String id, String type, int rank, int context) {
        super(id, type);
        this.rank = rank;
        this.context = context;
    }

    /**
     * Getter : rank
     *
     * @return rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Getter : context
     * @return context
     */
    public int getContext() {
        return context;
    }
}
