/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btth;

/**
 *
 * @author CCNE
 */
public class Btth {

    public int UCLN(int a, int b){
    if(b==0) 
        return a;
    else
        return UCLN(b,a % b);
    
}
     public int Fibo(int n){
         if (n==0) return 0;
         if (n==1) return 1;
         return Fibo(n-1)+Fibo(n-2);
     }
     
     
     
     
     
    public static void main(String[] args) {
        // TODO code application logic here
        Btth abc = new Btth();
        System.out.println(abc.UCLN(65, 15));
        System.out.println(abc.Fibo(2));
        
        
        
    }
    
}

