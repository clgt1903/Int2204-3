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
public class USCLN {
    private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Nhap vao so nguyen duong a = ");
		int a = input.nextInt();
		System.out.print("Nhap vao so nguyen duong b = ");
		int b = input.nextInt();
        System.out.print("USCLN la: " + USCLN(a,b)); 
	}
	public static int USCLN(int a,int b) {
		while(a!=b){
		if(a>b) a=a-b;
		else b=b-a;}
		return a;
	}

}

