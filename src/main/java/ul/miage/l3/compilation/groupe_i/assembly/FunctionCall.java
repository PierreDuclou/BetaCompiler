package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;
import ul.miage.l3.compilation.groupe_i.symbols.Function;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

public class FunctionCall extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public FunctionCall(Node node) {
        super(node);
    }

    @Override
    public String generate() {
        Function func = (Function) SymbolsTable
                .getInstance()
                .get(getClosestAncestor(node, NodeSymbol.FUNCTION).getSymbolsTableKey());

        String ret = "\nALLOCATE(1)";

        for (Node child: ((InnerNode) node).getChildren()) {
            ret += GenerableFactory.getGenerable(child).generate();
        }

        ret += "CALL(" + func.getId() + ")\n" +
                "DEALLOCATE(" + func.getNumberOfParameters() + ")\n";

        return ret;
    }
}