package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class MaxIntTest {

    @Test
    public void TestMax(){
        MaxInt maxInt = new MaxInt();
        Assert.assertEquals(3, maxInt.Max(3,2));
        Assert.assertEquals(100,maxInt.Max(1,100));
        Assert.assertEquals(20,maxInt.Max(20,15));
        Assert.assertEquals(50,maxInt.Max(40,50));
        Assert.assertEquals(100000,maxInt.Max(100000,10000));
    }
}
