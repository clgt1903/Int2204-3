/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tô Anh
 */
public class HamIT {
    
    
    @Test
public void testMax1() {
System.out.println("max1");
int a=1;
int b = 2;
int expResult = 2;
int result = Ham.max(a, b);
assertEquals(expResult, result);

}
@Test
public void testMax2() {
System.out.println("max2");
int a=11;
int b =21;
int expResult = 21;
int result = Ham.max(a, b);
assertEquals(expResult, result);

}
@Test
public void testMax3() {
System.out.println("max3");
int a=-9;
int b = 2;
int expResult = 2;
int result = Ham.max(a, b);
assertEquals(expResult, result);

}
@Test
public void testMax4() {
System.out.println("max4");
int a=36;
int b = 135;
int expResult = 135;
int result = Ham.max(a, b);
assertEquals(expResult, result);

}
@Test
public void testMax5() {
System.out.println("max5");
int a=45;
int b = 245;
int expResult = 245;
int result = Ham.max(a, b);
assertEquals(expResult, result);

}

/**
* Test of min method, of class ham.
*/
@Test
public void testMin1() {
System.out.println("min");
int arr[] = {1,2,3,4};
int expResult = 1;
int result = Ham.min(arr);
assertEquals(expResult, result);

}@Test
public void testMin2() {
System.out.println("min2");
int arr[] = {-9,1,2,3,4};
int expResult = -9;
int result = Ham.min(arr);
assertEquals(expResult, result);

}@Test
public void testMin3() {
System.out.println("min");
int arr[] = {-11,2,3,4};
int expResult = -11;
int result = Ham.min(arr);
assertEquals(expResult, result);

}
@Test
public void testMin4() {
System.out.println("min4");
int arr[] = {1,2,-3,4};
int expResult = -3;
int result = Ham.min(arr);
assertEquals(expResult, result);

}
@Test
public void testMin5() {
System.out.println("min5");
int arr[] = {1,2,-8,-44};
int expResult = -44;
int result = Ham.min(arr);
assertEquals(expResult, result);

}
/**
* Test of BMI method, of class ham.
*/
@Test
public void testBMI1() {
System.out.println("BMI1");
float a = 60.5F;
float b = 1.5F;
String expResult = "Beo phi";
String result = Ham.BMI(a, b);
assertEquals(expResult, result);

}
@Test
public void testBMI2() {
System.out.println("BMI2");
float a = 23.5F;
float b = 1.0F;
String expResult = "Thua can";
String result = Ham.BMI(a, b);
assertEquals(expResult, result);

}
@Test
public void testBMI3() {
System.out.println("BMI3");
float a = 23.15F;
float b = 1.024F;
String expResult = "Binh thuong";
String result = Ham.BMI(a, b);
assertEquals(expResult, result);

}
@Test
public void testBMI4() {
System.out.println("BMI");
float a = 19F;
float b = 1.2F;
String expResult = "Thieu can";
String result = Ham.BMI(a, b);
assertEquals(expResult, result);

}
@Test
public void testBMI5() {
System.out.println("BMI");
float a = 1.3F;
float b = 1.5F;
String expResult = "Thieu can";
String result = Ham.BMI(a, b);
assertEquals(expResult, result);

}
    
}
