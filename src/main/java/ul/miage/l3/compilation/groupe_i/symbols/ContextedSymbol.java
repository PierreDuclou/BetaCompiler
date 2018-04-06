package ul.miage.l3.compilation.groupe_i.symbols;

abstract class ContextedSymbol extends Symbol {
    /**
     * The index of the variable in the stack
     */
    int rank;

    /**
     * Refers to the related function's key in the symbol table
     */
    int context;

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
}
