package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;

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
public class Intio extends Generable {
    /**
     * Constructor
     *
     * @param node node
     */
    public Intio(Node node) {
        super(node);
    }

    @Override
    public String generate() throws Exception {
        String ret = null;
        NodeSymbol sym = node.getNodeSymbol();

        if (sym.equals(NodeSymbol.READ)) ret = "RDINT()\nPUSH(R0)\n";
        if (sym.equals(NodeSymbol.WRITE)) {
            ret = GenerableFactory.getGenerable(((InnerNode) node).getChildren().peek()).generate();
            ret += "POP(R0)\nWRINT()\n";
        }

        return ret;
    }
}
