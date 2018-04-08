package ul.miage.l3.compilation.groupe_i;

import generated.cuplex.ParserCup;
import generated.cuplex.Yylex;
import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;
import ul.miage.l3.compilation.groupe_i.symbols.expections.UndeclaredSymbolException;
import ul.miage.l3.compilation.groupe_i.utils.Prettifier;

import java.io.FileNotFoundException;
import java.io.FileReader;

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
    public static void main( String[] args ) throws UndeclaredSymbolException {
        try {
            ParserCup pc = new ParserCup(new Yylex(new FileReader("src/main/resources/example")));
            pc.parse();
            System.out.println("File parsed successfully.");
            System.out.println(Prettifier.prettify(SymbolsTable.getInstance().toString()));
            System.out.println(Prettifier.prettify(AbstractSyntaxTree.getInstance().toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
