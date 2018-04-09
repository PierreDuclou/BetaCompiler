package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.Function;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

/**
 * Represents a function in symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
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
                .get(node.getSymbolsTableKey());

        String ret = "ALLOCATE(1)\n";

        for (Node child: ((InnerNode) node).getChildren()) {
            ret += GenerableFactory.getGenerable(child).generate();
        }

        ret += "CALL(" + func.getId() + ")\n" +
               "DEALLOCATE(" + func.getNumberOfParameters() + ")\n";

        return ret;
    }
}
