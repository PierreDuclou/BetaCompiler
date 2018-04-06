package ul.miage.l3.compilation.groupe_i.symbols;

public class LocalVariable extends ContextedSymbol {
    /**
     * Value of the variable
     */
    private int value;

    /**
     * Constructor
     *
     * @param id identifier of the variable
     * @param type type of the variable
     * @param rank rank of the variable in the frame stack
     * @param context key of the related function's in the symbols table
     * @param value value of the variable
     */
    public LocalVariable(String id, String type, int rank, int context, String value) {
        super(id, type, rank, context);
        this.value = value != null ? Integer.parseInt(value) : 0;
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "LocalVariable{" +
                "value=" + value +
                ", rank=" + rank +
                ", context=" + context +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
