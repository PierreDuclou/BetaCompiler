package ul.miage.l3.compilation.groupe_i.symbols;

public class Function extends Symbol {
    private Integer numberOfParameters = 0;
    private Integer numberOfLocalVariables = 0;

    public Function(String id) {
        super(id);
    }

    public Function(String id, String type, int numberOfParameters, int numberOfLocalVariables) {
        super(id, type);
        this.numberOfParameters = numberOfParameters;
        this.numberOfLocalVariables = numberOfLocalVariables;
    }

    public Integer getNumberOfParameters() {
        return numberOfParameters;
    }

    public Integer getNumberOfLocalVariables() {
        return numberOfLocalVariables;
    }

    public void incrementNumberOfParameters() {
        numberOfParameters++;
    }

    public void incrementNumberOfLocalVariables() {
        numberOfLocalVariables++;
    }

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
