/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author CCNE
 */

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public int fib(int n) 
    {
            
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n == 0 || n == 1) 
        {
            return n;
        } 
        else 
        {
            for (int i = 2; i < n; i++) 
        {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
        }
        }
        return fn;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Fibonacci f=new Fibonacci();
        Scanner num= new Scanner(System.in);
        n=num.nextInt();
        System.out.println(f.fib(n));
    }
    
}
