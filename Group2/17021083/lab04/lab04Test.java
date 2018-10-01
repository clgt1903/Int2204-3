

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class lab04Test {
    
    public lab04Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
   
    
        @Test
	public void test1() {
 
		assertEquals(5,lab04.sosanh(5,3));
	}
	@Test
	public void test2() {
		assertEquals(7,lab04.sosanh(6,7));
	}
	@Test
	public void test3() {
		assertEquals(9,lab04.sosanh(2,9));
	}
	@Test
	public void test4() {
		assertEquals(24,lab04.sosanh(16,24));
	}
	@Test
	public void test5() {
		assertEquals(10001,lab04.sosanh(10001,99));
	}

    

    /**
     * Test of sosanhArray method, of class lab04.
     */
        @Test
        public void test6() 
	{
		int[] a= {2,3,4,5,1};
		assertEquals(1,lab04.sosanhArray(a));
	}
	@Test
	public void test7() 
	{
		int[] a= {2,0,4,5,1};
		assertEquals(0,lab04.sosanhArray(a));
	}
	@Test
	public void test8() 
	{
		int[] a= {2,3,4,5};
		assertEquals(2,lab04.sosanhArray(a));
	}
	@Test
	public void test9() 
	{
		int[] a= {2,3,4,5,1,6,7};
		assertEquals(1,lab04.sosanhArray(a));
	}
	@Test
	public void test10() 
	{
		int[] a= {2,3,4,6,8,9};
		assertEquals(2,lab04.sosanhArray(a));
	}


    @Test
    public void test11()
{
    assertEquals("thua can",lab04.BMI(65,1.66f));
}
     @Test
    public void test12()
{
    assertEquals("thieu can",lab04.BMI(45,1.65f));
}
     @Test
    public void test13()
{
    assertEquals("binh thuong",lab04.BMI(50,1.6f));
}
     @Test
    public void test14()
{
    assertEquals("beo phi",lab04.BMI(80,1.66f));
}
     @Test
    public void test15()
{
    assertEquals("beo phi",lab04.BMI(76,1.66f));
}

    /**
     * Test of main method, of class lab04.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lab04.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sosanh method, of class lab04.
     */
    @Test
    public void testSosanh() {
        System.out.println("sosanh");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = lab04.sosanh(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sosanhArray method, of class lab04.
     */
    @Test
    public void testSosanhArray() {
        System.out.println("sosanhArray");
        int[] arr = null;
        int expResult = 0;
        int result = lab04.sosanhArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BMI method, of class lab04.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weight = 0.0;
        double hight = 0.0;
        String expResult = "";
        String result = lab04.BMI(weight, hight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

