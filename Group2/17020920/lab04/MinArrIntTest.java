package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class MinArrIntTest {
    @Test
    public void testMin1(){
        MinArrInt arrInt =new MinArrInt();
        arrInt.nhap(10);
        arrInt.nhap(4);
        arrInt.nhap(3);
        Assert.assertEquals(3,arrInt.Min());
    }
    @Test
    public void testMin2(){
        MinArrInt arrInt = new MinArrInt();
        arrInt.nhap(100);
        arrInt.nhap(300);
        arrInt.nhap(350);
        arrInt.nhap(780);
        arrInt.nhap(910);
        arrInt.nhap(240);
        arrInt.nhap(50);
        arrInt.nhap(70);
        arrInt.nhap(1000);
        arrInt.nhap(280);
        Assert.assertEquals(50,arrInt.Min());
    }
    @Test
    public void testMin3(){
        MinArrInt arrInt = new MinArrInt();
        arrInt.nhap(1000);
        arrInt.nhap(3000);
        arrInt.nhap(3050);
        arrInt.nhap(7080);
        arrInt.nhap(9010);
        arrInt.nhap(2040);
        arrInt.nhap(1);
        arrInt.nhap(700);
        arrInt.nhap(1200);
        arrInt.nhap(2830);
        Assert.assertEquals(1,arrInt.Min());
    }
    @Test
    public void testMin4(){
        MinArrInt arrInt = new MinArrInt();
        arrInt.nhap(2);
        arrInt.nhap(4);
        arrInt.nhap(2);
        arrInt.nhap(5);
        Assert.assertEquals(2,arrInt.Min());
    }

    @Test
    public void testMin5(){
        MinArrInt arrInt = new MinArrInt();
        arrInt.nhap(999);
        arrInt.nhap(998);
        arrInt.nhap(997);
        arrInt.nhap(99);
        Assert.assertEquals(99,arrInt.Min());
    }

}
