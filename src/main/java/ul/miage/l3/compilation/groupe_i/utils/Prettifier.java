package ul.miage.l3.compilation.groupe_i.utils;


/**
 * String prettifier
 *
 * @author Jérémy Thomas,
 * @author Ouafa Bourekhsas,
 * @author Salme Ould Ahmed,
 * @author Théo Cominolo,
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public class Prettifier {

    /**
     * Prettify an ugly JSON-like string
     *
     * @param uglyString string to prettify
     * @return pretty string (multilined and indented)
     */
    public static String prettify(String uglyString) {
        String prettyJSON = "";
        uglyString = uglyString.replace(", ", ",");
        int tabCount = 0;

        for (int i = 0; i < uglyString.length(); i++) {

            char c = uglyString.toCharArray()[i];

            switch (c) {
                case '[':
                case '{':
                    ++tabCount;
                    prettyJSON += String.format("%s\n%s", c,
                            new String(new char[tabCount]).replace("\0", "  "));
                    break;

                case '}':
                case ']':
                    --tabCount;
                    prettyJSON += String.format("\n%s%s",
                            new String(new char[tabCount]).replace("\0", "  "), c);
                    break;

                case ',':
                    prettyJSON += String.format("%s\n%s", c,
                            new String(new char[tabCount]).replace("\0", "  "));
                    break;

                default:
                    prettyJSON += c;
                    break;
            }

        }

        return prettyJSON;
    }

}
