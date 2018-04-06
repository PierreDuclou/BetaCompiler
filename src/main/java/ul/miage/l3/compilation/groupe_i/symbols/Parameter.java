package ul.miage.l3.compilation.groupe_i.symbols;

public class Parameter extends ContextedSymbol {
    /**
     * Constructor
     *
     * @param id identifier of the parameter
     * @param type type of the parameter
     * @param rank rank of the parameter in the frame stack
     * @param context related function's key in the symbols table
     */
    public Parameter(String id, String type, int rank, int context) {
        super(id, type, rank, context);
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "Parameter{" +
                "rank=" + rank +
                ", context=" + context +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
