package ul.miage.l3.compilation.groupe_i.symbols;

/**
 * Represents a local variable in symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
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
    public LocalVariable(String id, String type, int rank, int context, int value) {
        super(id, type, rank, context);
        this.value = value;
    }

    /**
     * Getter : value
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
        return "LocalVariable{" +
                "value=" + value +
                ", rank=" + rank +
                ", context=" + context +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
