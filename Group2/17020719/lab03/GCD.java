/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GCD {
    public int function(int a, int b){
        if(a < 0)
            a = -a;
        if(b < 0)
            b = -b;
        while(a != b){
            if(a > b)
                a -=b;
            else
                b -=a;
        }
        return a;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        GCD x = new GCD();
        System.out.println(x.function(a, b));
    }
    
}
