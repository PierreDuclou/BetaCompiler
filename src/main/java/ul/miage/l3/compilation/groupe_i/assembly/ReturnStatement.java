package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;
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
public class ReturnStatement extends Generable {
    private Function func;

    /**
     * Constructor
     *
     * @param node node
     */
    public ReturnStatement(Node node) {
        super(node);
        func = (Function) SymbolsTable
                .getInstance()
                .get(node.getSymbolsTableKey());
    }

    @Override
    public String generate() throws Exception {
        if (func == null || !func.getType().equals("int"))
            throw new Exception("Impossible d'utiliser le symbole return dans ce contexte.");

        String ret = GenerableFactory.getGenerable(((InnerNode) node).getChildren().getFirst()).generate() +
                "POP(R0)\n" +
                "PUTFRAME(R0, " + -(3 + func.getNumberOfParameters()) * 4 + ")\n" +
                "BR(return_" + func.getId() + ")\n";
        return ret;
    }
}
