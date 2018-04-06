package ul.miage.l3.compilation.groupe_i.symbols;

public class Function extends Symbol {
    /**
     * Number of function's parameters
     */
    private Integer numberOfParameters = 0;

    /**
     * Number of function's local variables
     */
    private Integer numberOfLocalVariables = 0;

    /**
     * Constructor
     *
     * @param id identifier of the function
     */
    public Function(String id) {
        super(id);
    }

    /**
     * Constructor
     *
     * @param id
     * @param type
     * @param numberOfParameters
     * @param numberOfLocalVariables
     */
    public Function(String id, String type, int numberOfParameters, int numberOfLocalVariables) {
        super(id, type);
        this.numberOfParameters = numberOfParameters;
        this.numberOfLocalVariables = numberOfLocalVariables;
    }

    /**
     * Getter : numberOfParameters
     *
     * @return numberOfParameters
     */
    public Integer getNumberOfParameters() {
        return numberOfParameters;
    }

    /**
     * Getter : numberOfLocalVariables
     *
     * @return numberOfLocalVariables
     */
    public Integer getNumberOfLocalVariables() {
        return numberOfLocalVariables;
    }

    /**
     * Increments numberOfParameters
     */
    public void incrementNumberOfParameters() {
        numberOfParameters++;
    }

    /**
     * Increments numberOfLocalVariables
     */
    public void incrementNumberOfLocalVariables() {
        numberOfLocalVariables++;
    }

    /**
     * String representation of the instance
     *
     * @return a string representing the instance
     */
    @Override
    public String toString() {
        return "Function{" +
                "numberOfParameters=" + numberOfParameters +
                ", numberOfLocalVariables=" + numberOfLocalVariables +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
