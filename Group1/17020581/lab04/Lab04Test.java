package lab04;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab04Test {
    
   
    /**
     * Test of GTLN method, of class Lab04.
     */
    @Test
    public void testGTLN1() {
        System.out.println("GTLN1");
        assertEquals(5, Lab04.GTLN(3, 5));     
    }
    @Test
    public void testGTLN2() {
        System.out.println("GTLN2");
        assertEquals(5, Lab04.GTLN(3, 5));     
    }
    @Test
    public void testGTLN3() {
        System.out.println("GTLN3");
        assertEquals(4, Lab04.GTLN(2, 4));     
    }
    @Test
    public void testGTLN4() {
        System.out.println("GTLN4");
        assertEquals(6, Lab04.GTLN(2, 6));     
    }
    @Test
    public void testGTLN5() {
        System.out.println("GTLN5");
        assertEquals(3, Lab04.GTLN(3, 1));     
    }
    /**
     * Test of GTNN method, of class Lab04.
     */
     @Test
    public void testGTNN1() {
       System.out.println("GTNN1");
       int arr[] = {1, 2, 3 , 4, 5};
        assertEquals(1, Lab04.GTNN(arr));     
    }
    @Test
    public void testGTNN2() {
       System.out.println("GTNN2");
       int arr[] = {6, 2, 3 , 4, 5};
        assertEquals(2, Lab04.GTNN(arr));     
    }
    @Test
    public void testGTNN3() {
       System.out.println("GTNN3");
       int arr[] = {6, 7, 3 , 4, 5, 1};
        assertEquals(1, Lab04.GTNN(arr));     
    }
    @Test
    public void testGTNN4() {
       System.out.println("GTNN4");
       int arr[] = {7, 8, 9, 4, 5};
        assertEquals(4, Lab04.GTNN(arr));     
    }
    @Test
    public void testGTNN5() {
       System.out.println("GTNN5");
       int arr[] = {1, 2, 8 , 4, 7};
        assertEquals(1, Lab04.GTNN(arr));     
    }
    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI1() {
         System.out.println("BMI1");
        assertEquals("Binh thuong", Lab04.BMI(45.0, 1.5));     
    }
   
    @Test
    public void testBMI2() {
        System.out.println("BMI2");
        assertEquals("Beo phi", Lab04.BMI(60.0, 1.5));     
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI3");
        assertEquals("Thua can", Lab04.BMI(54.0, 1.5));     
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI4");
        assertEquals("Thieu can", Lab04.BMI(37.0, 1.5));     
    }
    @Test
    public void testBMI5() {
       System.out.println("BMI5");
        assertEquals("Binh thuong", Lab04.BMI(42.0, 1.5));     
    }
    
}