/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quoc
 */
public class baitaptuan4Test {
    
    @Test
    public void testTimmax0() {
        System.out.println("timmax");
        int a = 0;
        int b = 10;
        int expResult = 10;
        int result = baitaptuan4.timmax(a, b);
        assertEquals(expResult, result);
    }
     @Test
    public void testTimmax1() {
        System.out.println("timmax");
        int a = 5;
        int b = 10;
        int expResult = 10;
        int result = baitaptuan4.timmax(a, b);
        assertEquals(expResult, result);
    } @Test
    public void testTimmax2() {
        System.out.println("timmax");
        int a = 30;
        int b = 10;
        int expResult = 30;
        int result = baitaptuan4.timmax(a, b);
        assertEquals(expResult, result);
    } @Test
    public void testTimmax3() {
        System.out.println("timmax");
        int a = 40;
        int b = 10;
        int expResult = 40;
        int result = baitaptuan4.timmax(a, b);
        assertEquals(expResult, result);
    } @Test
    public void testTimmax4() {
        System.out.println("timmax");
        int a = 25;
        int b = 10;
        int expResult = 25;
        int result = baitaptuan4.timmax(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinArray0() {
        System.out.println("minArray");
        int  h[] = new int[] {1,2,3,4,5};
        int expResult = 1;
        int result = baitaptuan4.minArray(h);
        assertEquals(expResult, result);
    }
     @Test
    public void testMinArray1() {
        System.out.println("minArray");
        int  h[] = new int[] {5,9,7,6,10};
        int expResult = 5;
        int result = baitaptuan4.minArray(h);
        assertEquals(expResult, result);
    } @Test
    public void testMinArray2() {
        System.out.println("minArray");
        int  h[] = new int[] {-8,-9,-40,5,9};
        int expResult = -40;
        int result = baitaptuan4.minArray(h);
        assertEquals(expResult, result);
    } @Test
    public void testMinArray3() {
        System.out.println("minArray");
        int  h[] = new int[] {2,6,9,4,-1};
        int expResult = -1;
        int result = baitaptuan4.minArray(h);
        assertEquals(expResult, result);
    } @Test
    public void testMinArray4() {
        System.out.println("minArray");
        int  h[] = new int[] {5,7,6,1,6};
        int expResult = 1;
        int result = baitaptuan4.minArray(h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI_Test0() {
        System.out.println("BMI_Test");
        float w = 59F;
        float h = 1.7F;
        String expResult = "Binh thuong";
        String result = baitaptuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
    }
     @Test
    public void testBMI_Test1() {
        System.out.println("BMI_Test");
        float w = 59F;
        float h = 1.7F;
        String expResult = "Binh thuong";
        String result = baitaptuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
    }
     @Test
    public void testBMI_Test2() {
        System.out.println("BMI_Test");
        float w = 40F;
        float h = 1.6F;
        String expResult = "Thieu can";
        String result = baitaptuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
    }
     @Test
    public void testBMI_Test3() {
        System.out.println("BMI_Test");
        float w = 44F;
        float h = 1.5F;
        String expResult = "Binh thuong";
        String result = baitaptuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
    }
     @Test
    public void testBMI_Test4() {
        System.out.println("BMI_Test");
        float w = 60F;
        float h = 1.52F;
        String expResult = "Beo phi";
        String result = baitaptuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
    }
}
