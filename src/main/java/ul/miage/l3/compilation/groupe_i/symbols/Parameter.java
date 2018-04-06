package ul.miage.l3.compilation.groupe_i.symbols;

public class Parameter extends ContextedSymbol {
    public Parameter(String id, String type, int rank, int context) {
        super(id, type, rank, context);
    }

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
