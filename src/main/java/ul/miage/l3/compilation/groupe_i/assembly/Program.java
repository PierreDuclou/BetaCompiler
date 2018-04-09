package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.GlobalVariable;
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
public class Program extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public Program(Node node) {
        super(node);
    }

    @Override
    public String generate() {
        String ret =
                ".include beta.uasm\n" +
                ".include intio.uasm\n" +
                ".options tty\n\n" +
                "CMOVE(stack,SP)\n" +
                "BR(start)\n";

        SymbolsTable table = SymbolsTable.getInstance();
        boolean main = false;

        for (int i: table) {
            if (table.get(i) instanceof GlobalVariable) {
                GlobalVariable var = (GlobalVariable) table.get(i);
                ret += var.getId() + ": LONG(" + var.getValue() + ")\n";
            }

            if (table.get(i).getId().equals("main"))
                main = true;
        }

        for (Node child: ((InnerNode) node).getChildren()) {
            ret += GenerableFactory.getGenerable(child).generate();
        }

        ret += "\nstart:\n" +
               (main ? "CALL(main)\n" : "") +
               "HALT()\n\n" +
               "stack:";
        return ret;
    }
}
