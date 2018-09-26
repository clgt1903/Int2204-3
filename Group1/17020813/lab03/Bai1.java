/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public int UCLN(int a, int b)
    {
        if (b == 0) return a;
        return UCLN(b, a % b);


        // TODO: Tính ước chung lớn nhất của 2 số a, b
        }
    
    public int fibonacci(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-2)+fibonacci(n-1);              
    }
   public static void main(String[] args)
    {
	Bai1 temp = new Bai1();
        int a=9, b=3;
        System.out.println("UCLN : " + temp.UCLN(a,b));
        int n=10;
        System.out.println("Fibonacci : "+ temp.fibonacci(n));
    }
}
