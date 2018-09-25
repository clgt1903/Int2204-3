/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapucln;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thúy
 */
public class BAiTapUCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap a: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap b: ");
        int num2 = scanner.nextInt();
        System.out.println("UCLN giua a va b la: " +UCLN(num1, num2));
        int n = scanner.nextInt();
        System.out.println("So Fibonacci thu n la: "+Fibonacci(n));
    }
    public static int UCLN (int num1, int num2)
    {
        while (num1 !=num2)
        {
            if(num1>num2) num1-=num2;
            else          num2-=num1;
        }
        return num1;
    }
    public static int Fibonacci(int n)
    {
        int fn=0, f0=0 , f1=1;
        if(n==0) fn= 0;
        if(n==1) fn= 1;
        else for(int i=1 ; i<=n ; i++)
        {
        
            fn = f0 + f1;
            f0= f1;
            f1 = fn;
        }
        return fn;
    }
    
}
