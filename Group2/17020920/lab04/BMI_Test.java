package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class BMI_Test {
    @Test
    public void testBMI(){
        BMI test_bmi =new BMI();
        Assert.assertEquals("Binh Thuong",test_bmi.HienThi_BMI(45,1.5));
        Assert.assertEquals("Beo Phi",test_bmi.HienThi_BMI(100,1.65));
        Assert.assertEquals("Beo Phi",test_bmi.HienThi_BMI(80,1.74));
        Assert.assertEquals("Binh Thuong",test_bmi.HienThi_BMI(52,1.62));
        Assert.assertEquals("Thieu Can",test_bmi.HienThi_BMI(48,1.64));
    }
}
