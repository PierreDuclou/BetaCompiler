package ul.miage.l3.compilation.groupe_i.assembly;

import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;

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
public class BetaGenerator {
    public static String generateAssembly(String output) {
        Program p = new Program(AbstractSyntaxTree.getInstance().getRoot());

        return p .generate();
    }
}
