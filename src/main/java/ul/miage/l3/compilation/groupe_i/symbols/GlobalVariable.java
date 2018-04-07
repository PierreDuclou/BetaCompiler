package ul.miage.l3.compilation.groupe_i.symbols;

public class GlobalVariable extends Symbol {
    /**
     * Value of the variable
     */
    private int value;

    /**
     * Constructor
     *
     * @param id identifier of the variable
     * @param type type of the variable
     * @param value value of the variable
     */
    public GlobalVariable(String id, String type, int value) {
        super(id, type);
        this.value = value;
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "GlobalVariable{" +
                "value=" + value +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
