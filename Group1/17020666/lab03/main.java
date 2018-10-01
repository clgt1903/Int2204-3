package com.tuan3.java;
import java.util.Scanner;

public class main {
   public static void main(String args[])
     {
    	 System.out.println("xin ban nhap hai so tu ban phim");
    	 /*int x1,y1,x2,y2;
    	 Scanner scan= new Scanner(System.in);
    	 x1=scan.nextInt();
    	 y1=scan.nextInt();
    	 x2=scan.nextInt();
    	 y2=scan.nextInt();*/
    	 phanso a=new phanso(3,4);
    	 phanso b=new phanso(5,6);
    	//a.inphanso();
    	 if(a.equals(b)==true) {
    		 System.out.println("true");
    	 }
    	 else {
    		 System.out.println("false");
    	 }
    	 //System.out.println(a.ucln(x1, y1));
    	 System.out.println("tong cua hai phan so la");
    	 a.cong(b);
    	 a.nhan(b);
    	 a.tru(b);
    	 a.chia(b);
    	 }
}
