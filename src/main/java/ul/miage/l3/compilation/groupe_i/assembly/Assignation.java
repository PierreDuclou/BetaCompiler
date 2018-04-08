package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.InnerNode;
import ul.miage.l3.compilation.groupe_i.ast.Node;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;

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
        Node fg = ((InnerNode) node).getChildren().getFirst();
        Node fd = ((InnerNode) node).getChildren().getLast();

        return GenerableFactory.getGenerable(fd).generate() +
                "POP(R0)\n" +
                "ST(R0, " + SymbolsTable.getInstance().get(fg.getSymbolsTableKey()).getId() + ")\n";
    }
}
