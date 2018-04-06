package ul.miage.l3.compilation.groupe_i.symbols;

abstract class Symbol {
    String id;
    String type;

    public Symbol(String id, String type) {
        this.id = id;
        this.type = type;
    }
}
