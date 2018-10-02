package lab04;

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
public class Lab04Test {
    
    public Lab04Test() {
    }
    
    
    @Test
    public void testSolon() {
        assertEquals(2,Lab04.solon(2, 1));
       
    }
      @Test
    public void testSolon1() {
        assertEquals(7,Lab04.solon(2, 7));
       
    }
      @Test
    public void testSolon2() {
        assertEquals(4,Lab04.solon(4, 1));
       
    }
      @Test
    public void testSolon3() {
        assertEquals(9,Lab04.solon(2, 9));
       
    }
      @Test
    public void testSolon4() {
        assertEquals(10,Lab04.solon(2, 10));
       
    }

    /**
     * Test of searchMin method, of class Lab04.
     */
    @Test
    public void testSearchMin() {
        int[] arr = {1,2,3};
        assertEquals(1,Lab04.searchMin(arr));
        
    }
     @Test
    public void testSearchMin1() {
        int[] arr1 = {4,2,3};
        assertEquals(2,Lab04.searchMin(arr1));
        
    }
     @Test
    public void testSearchMin2() {
        int[] arr2 = {5,2,3};
        assertEquals(2,Lab04.searchMin(arr2));
        
    }
     @Test
    public void testSearchMin3() {
        int[] arr3 = {5,2,3};
        assertEquals(2,Lab04.searchMin(arr3));
        
    }
     @Test
    public void testSearchMin4() {
        int[] arr4 = {1,2,7};
        assertEquals(1,Lab04.searchMin(arr4));
        
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI0() {
       
        assertEquals("Thieu can",Lab04.BMI(50, (float) 1.78));
       
    }
    @Test
     public void testBMI1() {
        assertEquals("Thua can",Lab04.BMI(55, (float) 1.50));
       
    }
        @Test
      public void testBMI2() {
        assertEquals("Binh thuong",Lab04.BMI(52, (float) 1.55));
       
    }
         @Test
       public void testBMI3() {
        assertEquals("Thieu can",Lab04.BMI(53, (float) 1.81));
       
    }
          @Test
        
       public void testBMI4() {
        assertEquals("Beo phi",Lab04.BMI(70, (float) 1.20));
       
    }
    
      
    
}
