/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.Scanner;

/**
 *
 * @author Windows 81
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sofibo());
        // TODO code application logic here
    }
    public static int sofibo()
    {
        Scanner sc = new Scanner(System.in);
        int n,i,fn=0;
        n=sc.nextInt();
        int f1=1,f2=1;
        if(n==1||n==2)
        return 1;
        else if( n>2)
        {
           
            for(i=3;i<=n;i++)
            {
            fn=f1+f2;
            f1=f2;
            f2=fn;           
          }
        
        } 
        return fn;
       
          
    
}
}