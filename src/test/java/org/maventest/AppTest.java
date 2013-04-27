package org.maventest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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


    public void testOrder() {
        assertEquals(9, App.largest(new int[] {9,8,7}));
        assertEquals(9, App.largest(new int[] {8,9,7}));
        assertEquals(9, App.largest(new int[] {7,8,9}));
    }

    public void testEmpty() {
        try {
            App.largest(new int[] {});
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

    public void testOrder2() {
        int[] arr = new int[3];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        assertEquals(9, App.largest(arr));
    }
}
