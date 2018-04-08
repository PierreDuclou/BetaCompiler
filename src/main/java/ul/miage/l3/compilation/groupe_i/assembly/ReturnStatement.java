package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;
import ul.miage.l3.compilation.groupe_i.symbols.Function;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

public class ReturnStatement extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public ReturnStatement(Node node) {
        super(node);
    }

    @Override
    public String generate() {
        Function func = (Function) SymbolsTable
                .getInstance()
                .get(getClosestAncestor(node, NodeSymbol.FUNCTION).getSymbolsTableKey());

        String ret = "POP(R0)\n" +
                "PUTFRAME(R0, " + -(2 + func.getNumberOfParameters()) * 4 + ")\n" +
                "BR(return_" + func.getId() + ")\n";
        return ret;
    }
}
