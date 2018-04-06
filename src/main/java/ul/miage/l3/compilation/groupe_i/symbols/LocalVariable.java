package ul.miage.l3.compilation.groupe_i.symbols;

public class LocalVariable extends ContextedSymbol {
    private int value;

    public LocalVariable(String id, String type, int rank, String context, int value) {
        super(id, type, rank, context);
        this.value = value;
    }

    @Override
    public String toString() {
        return "LocalVariable{" +
                "value=" + value +
                ", rank=" + rank +
                ", context='" + context + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
