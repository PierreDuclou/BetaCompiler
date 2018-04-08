package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;

public class BetaGenerator {
    public static void generateAssembly(String output) {
        Program p = new Program(AbstractSyntaxTree.getInstance().getRoot());
    }
    
}
