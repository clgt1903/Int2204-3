package week4;


import org.junit.Test;
import static org.junit.Assert.*;


public class Week4Test {
    
   
    /**
     * Test of maxab method, of class Week4.
     */
    @Test
    public void testMaxab1() {
        /*System.out.println("maxab");
        int a = 4;
        int b = 5;
        int expResult = 5;
        int result = Week4.maxab(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        */
        assertEquals(5, Week4.Maxab(3,5));}
    @Test
    public void testMaxab2() {
        assertEquals(7, Week4.Maxab(3,7));}
    @Test
    public void testMaxab3() {
        assertEquals(9, Week4.Maxab(9,5));}
    @Test
    public void testMaxab4() {
        assertEquals(4, Week4.Maxab(3,4));}
    @Test
    public void testMaxab5() {
        assertEquals(10, Week4.Maxab(10,5));
    }

    /**
     * Test of minarr method, of class Week4.
     */
    @Test
    public void testMinarr1() {
        /*System.out.println("minarr");
        int[] arr = {5,3,4,1,8};
        int expResult =1;
        int result = Week4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        */
        int arr1[]={0,1,2,3,4,5};
        assertEquals(0, Week4.Minarr(arr1));}
    @Test
    public void testMinarr2() {
        int arr2[]={9,1000,33};
        assertEquals(9, Week4.Minarr(arr2));}
    @Test
    public void testMinarr3() {
         int arr3[]={0,1,2,3,4};
        assertEquals(0, Week4.Minarr(arr3));}
    @Test
    public void testMinarr4() {
       int arr4[]={0,-1,2,3,4,5};
        assertEquals(-1, Week4.Minarr(arr4));}
    @Test
    public void testMinarr5() {
          int arr5[]={0,1,2,3,4,-5};
        assertEquals(-5, Week4.Minarr(arr5));
      
        
    }

    /**
     * Test of bmi method, of class Week4.
     */
    @Test
    public void testBmi1() {
        /*System.out.println("bmi");
        double x = 45.0;
        double y = 1.7;
        String expResult = "thieu can";
        String result = Week4.bmi(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        */
        assertEquals("thieu can", Week4.bmi(50,1.9));}
     @Test
    public void testBmi2() {
        assertEquals("thieu can", Week4.bmi(45,1.7));}
     @Test
    public void testBmi3() {
        assertEquals("binh thuong", Week4.bmi(60,1.67));}
     @Test
    public void testBmi4() {
        assertEquals("beo phi", Week4.bmi(90,1.6));}
     @Test
    public void testBmi5() {
        assertEquals("thua can", Week4.bmi(68,1.65));

    }
    
}