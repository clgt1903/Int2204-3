/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

import java.util.Scanner;

public class fibonaci
{
    public static long fibonaci( int n)
    {
        if((n==0)||(n==1))
            return n;
        else
            return fibonaci(n-1)+fibonaci(n-2);
    }
   
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int n;
    System.out.println("Nhập n:\t ");
    n=input.nextInt();
    System.out.print(fibonaci(n));
}
}