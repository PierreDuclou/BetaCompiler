package ul.miage.l3.compilation.groupe_i.symbols;

interface ContextedSymbol extends Symbol {
    int rank = 0;
    String context = null;
}
