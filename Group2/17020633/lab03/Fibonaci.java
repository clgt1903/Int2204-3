/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

 import java.util.Scanner;
public class Fibonaci {

    public   int socantim(int n)
    {
        int[] fibo=new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<=n;i++)
        {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo[n];
        
    }
    public static void main(String[] args) {
        Fibonaci xyz=new Fibonaci();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println(xyz.socantim(n));
        
    }
    
}
