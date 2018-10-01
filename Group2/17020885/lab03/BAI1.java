/*-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.*;

/**
 *
 * @author Dell
 */
public class BAI1 {

    public int UCLN(int a,int b){
        
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else b=b-a;
        }
     return a;   
    }
    
    public int fibo(int n){
       int[] fb=new int[100];
       fb[0]=0;
       fb[1]=1;
       for(int i=2;i<n;i++)
       {
           fb[i]=fb[i-1]+fb[i-2];
           
       }
       return fb[n-1];
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,a,b;
        BAI1 bai1=new BAI1();
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(""+bai1.UCLN(Math.abs(a),Math.abs(b)));
        n=sc.nextInt();
        
        System.out.println(""+bai1.fibo(n));
    }
    
}
