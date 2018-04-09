package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;

/**
 * Assembly generator
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class BetaGenerator {

    /**
     * Generates and returns assembly code
     *
     * @return asm code
     */
    public static String generateAssembly() throws Exception {
        Program p = new Program(AbstractSyntaxTree.getInstance().getRoot());
        return p.generate();
    }
}
