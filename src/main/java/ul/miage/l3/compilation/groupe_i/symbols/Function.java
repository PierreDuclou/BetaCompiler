package ul.miage.l3.compilation.groupe_i.symbols;

public class Function extends Symbol {
    private int numberOfParameters;
    private int numberOfLocalVariables;

    public Function(String id, String type, int numberOfParameters, int numberOfLocalVariables) {
        super(id, type);
        this.numberOfParameters = numberOfParameters;
        this.numberOfLocalVariables = numberOfLocalVariables;
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
