package com.tuan3.java;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		 int x,y,fb;
		 Scanner scanner =new Scanner(System.in);
		 x = scanner.nextInt();
		 y = scanner.nextInt();
		 fb = scanner.nextInt();
		 System.out.println(ucln(x,y));
		 fibonaci(fb);
		 }
	public static void fibonaci(int fb)
	{
		int f0=0,f1=1,f2;
		System.out.print(f0+" "+f1+" ");
		for(int i=2;i<fb;i++) {
			f2=f1+f0;
			System.out.print(f2+" ");
			f0=f1;
			f1=f2;

		}
		
	}
	public static int ucln(int x,int y) {
		int x_,y_,du;
		
		if(x>y) {
			x_=x;
			y_=y;
		}else {
			x_=y;
			y_=x;
		}
		while(x_%y_!=0) {
			du=x_%y_;
			x_=y_;
			y_=du;
			
		}
		return y_;
		
	}

}
