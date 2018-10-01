package lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test
{
    @Test
    public void ktratimmax1()//kiểm tra hàm tìm max 2 số nguyên
    {
        lab04 lab = new lab04();
        assertEquals(6, lab.findmax(3, 6));
    }
    @Test
    public void ktratimmax2()//kiểm tra hàm tìm max 2 số nguyên
    {
        lab04 lab = new lab04();
        assertEquals(4, lab.findmax(4, 1));
    }
    @Test
    public void ktratimmax3()//kiểm tra hàm tìm max 2 số nguyên
    {
        lab04 lab = new lab04();
        assertEquals(7, lab.findmax(3, 7));
    }
    @Test
    public void ktratimmax4()//kiểm tra hàm tìm max 2 số nguyên
    {
        lab04 lab = new lab04();
        assertEquals(5, lab.findmax(5, 1));
    }
    @Test
    public void ktratimmax5()//kiểm tra hàm tìm max 2 số nguyên
    {
        lab04 lab = new lab04();
        assertEquals(9, lab.findmax(6, 9));
    }
    @Test
    public void ktraminmang1()//kiểm tra hàm tìm min 1 mảng
    {
        lab04 lab = new lab04();
        int[] ints = {6,3,8,2,5,9,7,1};
        assertEquals(1,lab.minarray(ints));
    }
    @Test
    public void ktraminmang2()//kiểm tra hàm tìm min 1 mảng
    {
        lab04 lab = new lab04();
        int[] ints = {1,3,5,8,9,4};
        assertEquals(1,lab.minarray(ints));
    }
    @Test
    public void ktraminmang3()//kiểm tra hàm tìm min 1 mảng
    {
        lab04 lab = new lab04();
        int[] ints = {7,5,7,3,4,6,2};
        assertEquals(2,lab.minarray(ints));
    }
    @Test
    public void ktraminmang4()//kiểm tra hàm tìm min 1 mảng
    {
        lab04 lab = new lab04();
        int[] ints = {5,9,7,3,2,6,8};
        assertEquals(2,lab.minarray(ints));
    }
    @Test
    public void ktraminmang5()//kiểm tra hàm tìm min 1 mảng
    {
        lab04 lab = new lab04();
        int[] ints = {1,2,3,4,5,6,7,8,9};
        assertEquals(1,lab.minarray(ints));
    }
    @Test
    public void ktraBMI1()// kiểm tra chỉ số BMI
    {
        lab04 lab = new lab04();
        assertEquals("Thiếu cân",lab.BMI(41.4f, 1.56f));
    }
    @Test
    public void ktraBMI2()// kiểm tra chỉ số BMI
    {
        lab04 lab = new lab04();
        assertEquals("Bình thường",lab.BMI(45.7f, 1.56f));
    }
    @Test
    public void ktraBMI3()// kiểm tra chỉ số BMI
    {
        lab04 lab = new lab04();
        assertEquals("Thừa cân",lab.BMI(60.7f, 1.56f));
    }
    @Test
    public void ktraBMI4()// kiểm tra chỉ số BMI
    {
        lab04 lab = new lab04();
        assertEquals("Thiếu cân",lab.BMI(41.4f, 1.56f));
    }
    @Test
    public void ktraBMI5()// kiểm tra chỉ số BMI
    {
        lab04 lab = new lab04();
        assertEquals("Béo phì",lab.BMI(70.6f, 1.56f));
    }
}