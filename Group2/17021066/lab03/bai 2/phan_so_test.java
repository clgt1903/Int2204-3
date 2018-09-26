package com.company;

public class phan_so_test {
    public static void main(String[] ahedh) {
        //tao doi tuong kieu phan so de truyen gia tri tu,mau
        Rational a=new Rational(5,-6);
        Rational  b=new Rational(-5,6);
        //doi tuong kq de luu kq sau khi tinh
        Rational kq=new Rational();

        //tao doi tuong kieu ps de thuc hien cac phep toan
        PS p2 = new PS();
        kq = p2.cong(a, b);
        p2.setPhanso(kq);
        p2.setUcln();
        p2.rutgon();
        System.out.println(kq.getTu() + "/" + kq.getMau());
        System.out.println(p2.equals(a,b));
    }
}
