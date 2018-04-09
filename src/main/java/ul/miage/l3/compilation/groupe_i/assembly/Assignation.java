package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.*;

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
public class Assignation extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public Assignation(Node node) {
        super(node);
    }

    @Override
    public String generate() {
        Node left = ((InnerNode) node).getChildren().getFirst();
        Node right = ((InnerNode) node).getChildren().getLast();

        // Symbol of the assigned variable
        Symbol sym = SymbolsTable.getInstance().get(left.getSymbolsTableKey());

        // Generating result of the right member (assigned value)
        String ret = "\n| Affectation de " + sym.getId() + ":\n" +
                GenerableFactory.getGenerable(right).generate() + "POP(R0)\n";

        if (sym instanceof GlobalVariable)
            ret += "ST(R0, " + sym.getId() + ")\n";
        if (sym instanceof Parameter)
            ret += "PUTFRAME(R0, " + -(3+((Parameter) sym).getRank()) * 4 + ")\n";
        if (sym instanceof LocalVariable)
            ret += "PUTFRAME(R0, " + ((LocalVariable) sym).getRank() * 4 + ")\n";

        return ret;
    }
}
