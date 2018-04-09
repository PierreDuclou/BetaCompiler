package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.Function;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

/**
 * Function definition generable
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class FunctionDefinition extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public FunctionDefinition(Node node) {
        super(node);
    }

    @Override
    public String generate() {
        Function sym = (Function) SymbolsTable.getInstance().get(node.getSymbolsTableKey());

        String ret = '\n' + sym.getId() + ":\n" +
                "PUSH(LP)\n" +
                "PUSH(BP)\n" +
                "MOVE(SP, BP)\n" +
                "ALLOCATE(" + sym.getNumberOfLocalVariables() + ")\n";

        for (Node child: ((InnerNode) node).getChildren()) {
            ret += GenerableFactory.getGenerable(child).generate();
        }

        ret += "\nreturn_" + sym.getId() + ":\n" +
                "DEALLOCATE(" + sym.getNumberOfLocalVariables() + ")\n" +
                "POP(BP)\n" +
                "POP(LP)\n" +
                "RTN()\n";

        return ret;
    }
}
