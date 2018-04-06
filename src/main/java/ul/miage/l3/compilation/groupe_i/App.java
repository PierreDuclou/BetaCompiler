package ul.miage.l3.compilation.groupe_i;

import generated.cuplex.ParserCup;
import generated.cuplex.Yylex;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;
import ul.miage.l3.compilation.groupe_i.utils.Prettifier;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Classe principale
 *
 * Auteurs :
 *      Jérémy Thomas,
 *      Ouafa Bourekhsas,
 *      Salme Ould Ahmed,
 *      Théo Cominolo,
 *      Pierre Duclou
 *
 * Version SNAPSHOT-1.0
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            ParserCup pc = new ParserCup(new Yylex(new FileReader("src/main/resources/example")));
            pc.parse();
            System.out.println("File parsed successfully.");
            System.out.println(Prettifier.prettify(SymbolsTable.getInstance().toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
