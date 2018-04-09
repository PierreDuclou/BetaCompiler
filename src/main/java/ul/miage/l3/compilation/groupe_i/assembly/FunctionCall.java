package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;
import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.Function;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

/**
 * Function call generable
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
     * Associated function
     */
    private Function func;

    /**
     * Constructor
     *
     * @param node node
     */
    public FunctionCall(Node node) {
        super(node);
        func = (Function) SymbolsTable
                .getInstance()
                .get(node.getSymbolsTableKey());
    }

    @Override
    public String generate() throws Exception {

        // Exception if incorrect number of arguments
        if (func.getNumberOfParameters() != ((InnerNode) node).getChildren().size())
            throw new Exception("Nombre d'arguments passés à \"" + func.getId() + "\" incorrect.");

        // Exception if function type incorrect
        if (!func.getType().equals("int"))
            throw new Exception("Le type de retour de la fonction \"" + func.getId() + "\" ne correspond pas.");

        String ret = "ALLOCATE(1)\n";

        for (Node child: ((InnerNode) node).getChildren()) {
            ret += GenerableFactory.getGenerable(child).generate();
        }

        ret += "CALL(" + func.getId() + ")\n" +
               "DEALLOCATE(" + func.getNumberOfParameters() + ")\n";

        return ret;
    }
}
