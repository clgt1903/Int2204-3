/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Lab_04Test {
    
    public Lab_04Test() {
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

    /**
     * Test of giatrimax method, of class Lab_04.
     */
    @Test
    public void testGiatrimax() {
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Lab_04.giatrimax(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGiatrimax2() {
        int a = 2;
        int b = 3;
        int expResult = 3;
        int result = Lab_04.giatrimax(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGiatrimax3() {
        int a = 3;
        int b = 4;
        int expResult = 4;
        int result = Lab_04.giatrimax(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGiatrimax4() {
        int a = 4;
        int b = 5;
        int expResult = 5;
        int result = Lab_04.giatrimax(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGiatrimax5() {
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Lab_04.giatrimax(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of giaTriMinArr method, of class Lab_04.
     */
    @Test
    public void testGiaTriMinArr() {
        int[] arr = new int[] {1,2};
        int expResult = 1;
        int result = Lab_04.giaTriMinArr(arr);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testGiaTriMinArr2() {
        int[] arr = new int[] {1,2,4};
      
        int expResult = 1;
        int result = Lab_04.giaTriMinArr(arr);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testGiaTriMinArr3(){
        int[] arr = new int[] {1,2,4,0,3,6};
      
        int expResult = 0;
        int result = Lab_04.giaTriMinArr(arr);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testGiaTriMinArr4() {
        int[] arr = new int[] {3,8,7,65,1};
      
        int expResult = 1;
        int result = Lab_04.giaTriMinArr(arr);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testGiaTriMinArr5() {
        int[] arr = new int[] {9,7,100};
      
        int expResult = 7;
        int result = Lab_04.giaTriMinArr(arr);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of chiSoBMI method, of class Lab_04.
     */
    @Test
    public void testChiSoBMI() {
        double weight = 63;
        double high = 1.73;
        String expResult = "Binh thuong";
        String result = Lab_04.chiSoBMI(weight, high);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testChiSoBMI2() {
        double weight = 60;
        double high = 1.78;
        String expResult = "Binh thuong";
        String result = Lab_04.chiSoBMI(weight, high);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testChiSoBMI3() {
        double weight = 70;
        double high = 1.65;
        String expResult = "Beo phi";
        String result = Lab_04.chiSoBMI(weight, high);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testChiSoBMI4() {
        double weight = 50;
        double high = 1.8;
        String expResult = "Thieu can";
        String result = Lab_04.chiSoBMI(weight, high);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testChiSoBMI5() {
        double weight = 62;
        double high = 1.6;
        String expResult = "Thua can";
        String result = Lab_04.chiSoBMI(weight, high);
        assertEquals(expResult, result);
        
    }
    
}
