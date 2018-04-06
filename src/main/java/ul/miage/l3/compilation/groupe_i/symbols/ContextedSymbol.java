package ul.miage.l3.compilation.groupe_i.symbols;

abstract class ContextedSymbol extends Symbol {
    int rank;
    String context;

    public ContextedSymbol(String id, String type, int rank, String context) {
        super(id, type);
        this.rank = rank;
        this.context = context;
    }
}
