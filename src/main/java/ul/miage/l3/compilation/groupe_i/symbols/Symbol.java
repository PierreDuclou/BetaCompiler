package ul.miage.l3.compilation.groupe_i.symbols;

abstract class Symbol {
    String id;
    String type;

    public Symbol(String id) {
        this.id = id;
    }

    public Symbol(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
