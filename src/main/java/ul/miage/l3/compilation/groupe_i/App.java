package ul.miage.l3.compilation.groupe_i;

import generated.cuplex.ParserCup;
import generated.cuplex.Yylex;
import ul.miage.l3.compilation.groupe_i.assembly.BetaGenerator;
import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;
import ul.miage.l3.compilation.groupe_i.symbols.exceptions.UndeclaredSymbolException;
import ul.miage.l3.compilation.groupe_i.utils.Prettifier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main class (contains entry point)
 *
 * @author Jérémy Thomas,
 * @author Ouafa Bourekhsas,
 * @author Salme Ould Ahmed,
 * @author Théo Cominolo,
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class App 
{
    /**
     * Entry point
     *
     * @param args command line arguments
     */
    public static void main( String[] args ) {
        ArrayList<String> exampleFiles = new ArrayList(Arrays.asList(
                new String[] {
                        "target/classes/1-minimal.txt",
                        "target/classes/2-variables_globales.txt",
                        "target/classes/3-expression_complexe.txt",
                        "target/classes/4-variables_locales.txt",
                        "target/classes/5-fonction_parametres.txt",
                        "target/classes/6-conditionnelle.txt",
                        "target/classes/7-iteration.txt"
                }
        ));
        try {
            ParserCup pc = new ParserCup(new Yylex(new FileReader(exampleFiles.get(5))));
            pc.parse();
            System.out.println("File parsed successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UndeclaredSymbolException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Prettifier.prettify(SymbolsTable.getInstance().toString()));
        System.out.println(Prettifier.prettify(AbstractSyntaxTree.getInstance().toString()));
        System.out.println(BetaGenerator.generateAssembly());
    }
}
