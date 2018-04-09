package ul.miage.l3.compilation.groupe_i;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
