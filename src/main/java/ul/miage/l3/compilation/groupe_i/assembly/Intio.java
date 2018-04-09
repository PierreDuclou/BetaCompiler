package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;

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
    public String generate() {
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
