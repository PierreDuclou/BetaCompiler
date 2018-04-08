package ul.miage.l3.compilation.groupe_i;

import generated.cuplex.ParserCup;
import generated.cuplex.Yylex;
import ul.miage.l3.compilation.groupe_i.ast.AbstractSyntaxTree;
import ul.miage.l3.compilation.groupe_i.ast.NodeSymbol;
import ul.miage.l3.compilation.groupe_i.symbols.ContextedSymbol;
import ul.miage.l3.compilation.groupe_i.symbols.Parameter;
import ul.miage.l3.compilation.groupe_i.symbols.Symbol;
import ul.miage.l3.compilation.groupe_i.symbols.SymbolsTable;
import ul.miage.l3.compilation.groupe_i.utils.Prettifier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
            System.out.println(Prettifier.prettify(AbstractSyntaxTree.getInstance().toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
