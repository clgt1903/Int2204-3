/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

 import java.util.Scanner;
 
 

public class Lab03 {

    
    public    int UCLN(int a,int b)
    {
        while(a!=b)
        {
            if(a<0)
                a=-a;
            if(b<0)
                b=-b;
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
     
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int a,b;
         a=sc.nextInt();
         b=sc.nextInt();
         Lab03 xyz= new Lab03();
         System.out.println("UCLN cua "+a+" va "+b+" la : "+xyz.UCLN (a,b));
    }
    
}
 