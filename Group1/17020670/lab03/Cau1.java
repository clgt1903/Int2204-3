package lab3;
import java.util.Scanner;



public class Cau1 {
	public  int UCLN(int a, int b) {
		if (a < 0) a = -a;
		if (b < 0) b = -b;
		if (a==0) return b;
		else if (b==0) return a;
		else
	
			while (a!=b) {
				if (a > b) a = a - b;
				else b = b - a;
			}
			return a;
		
	}
	public  int Fibonaci(int n) {
		if (n == 0) return 0;
		else {
				if (n == 1) return 1;
				else {
					int F1 = 0;
					int F2 = 1;
					int F = 0;
					for (int i = 0; i < n; i++) {
						F = F1 + F2;
						F1 = F2;
						F2 = F;
						}
					return F;
				}}
		
	}
	public static void main(String args[]) {
		Cau1 c = new Cau1();
		
		System.out.println("Moi nhap vao 2 so a, b: ");
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("UCLN cua a va b la: " + c.UCLN(a,b));
		
		System.out.println("Moi nhap vao so n: ");
		int n = sc.nextInt();
		System.out.println("F(" + n +") = " + c.Fibonaci(n));
		
	}
}
