/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.util.Scanner;

/**
 *
 * @author My PC
 */
public class Cau1 {

   public static Scanner input=new Scanner(System.in);
   
   
    public static void main(String[] args) {
       System.out.println("nhap so a :");
       int a=input.nextInt();
       System.out.println("nhap so b :");
       int b=input.nextInt();
       System.out.println("uoc chung lon nhat la :"+ UCLN(a,b));
        System.out.println("nhap so n :");
       int n=input.nextInt();
        System.out.println("fibonaci cua so do la :"+Fibo(n));
       
       
       
         
        
        
        // TODO code application logic here
    }
    public static int UCLN(int a,int b)
    {int c = 0 ;
    if(a<0)
    {
        a=-a;
    }
    if(b<0)
    {
        b=-b;
    }
       if(a>b)
       {
           for(int i=b;i>=1;i--)
           {
               if(a%i==0&&b%i==0)
               { c=i;
               break;}
           }
       }
       else
            for(int i=a;i>=1;i--)
           {
               if(a%i==0&&b%i==0)
               {   c=i;
               break;}
           }
       

        return c;
       
        
    }
    public int Fibo(int n)
    {
        int f0=0;
        int f1=1;
        int fn=1;
        for(int i=2;i<n;i++)
        {
            f0=f1;
            f1=fn;
            fn=f0+f1;
        }
        return fn;
        
    }
       
}
