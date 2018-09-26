/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Fibonacci {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Nhap vao so nguyen duong n:");
		int n=input.nextInt();
		int i,fibo0=0,fibo1=1,fibo=0;
		for(i=0;fibo1<n;i++)
		{
                    if(i==0) fibo=0;
                    else if(i==1) fibo=1;
			else
			{
				fibo=fibo0+fibo1;
				fibo0=fibo1;
				fibo1=fibo;
			}
		System.out.print(fibo+" ");
		}
}}
