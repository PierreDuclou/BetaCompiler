package ul.miage.l3.compilation.groupe_i.symbols;

public class GlobalVariable extends Symbol {
    private int value;

    public GlobalVariable(String id, String type, String value) {
        super(id, type);
        this.value = value != null ? Integer.parseInt(value) : 0;
    }

    @Override
    public String toString() {
        return "GlobalVariable{" +
                "value=" + value +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
