package ul.miage.l3.compilation.groupe_i.symbols;


/**
 * Represents a symbol stored in symbols table
 *
 * @author Jeremy Thomas
 * @author Ouafa Bourekhsas
 * @author Salme Ould Ahmed
 * @author Theo Cominolo
 * @author Pierre Duclou
 *
 * @version SNAPSHOT-1.0
 */
public abstract class Symbol {
    /**
     * Identifier of the symbol
     */
    protected String id;

    /**
     * Type of the symbol
     */
    protected String type;

    /**
     * Constructor
     *
     * @param id identifier of the symbol
     */
    public Symbol(String id) {
        this.id = id;
    }

    /**
     * Constructor
     *
     * @param id identifier of the symbol
     * @param type type of the symbol
     */
    public Symbol(String id, String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * Getter : id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter : id
     *
     * @param id new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter : type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter : type
     *
     * @param type new type
     */
    public void setType(String type) {
        this.type = type;
    }
}
