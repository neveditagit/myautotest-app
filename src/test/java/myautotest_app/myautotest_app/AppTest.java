package myautotest_app.myautotest_app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import myautotest_app.myautotest_app.TestLily;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	TestLily  testLily;// = new TestLily();

	
	
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
    	System.out.println("Hello Test");
        assertTrue( true );
    }
}
