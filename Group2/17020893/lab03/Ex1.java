package JavaWeek3;

import java.util.Scanner;

public class Ex1 {
	// tìm ucln của 2 số nguyên
	public int greatestCommonDivisor(int n1, int n2) {
		if (n1 == n2)
			return Math.abs(n1);
		else if (n1 > n2)
			return greatestCommonDivisor(Math.abs(n1 - n2), Math.abs(n2));
		else
			return greatestCommonDivisor(Math.abs(n1), Math.abs(n2 - n1));
	}
	// tính số fibonaci
	public int Fibonaci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return Fibonaci(n - 1) + Fibonaci(n - 2);
	}

	public static void main(String[] args) {
		// test ucln
		Ex1 greCD = new Ex1();
		Ex1 fibo = new Ex1();
		System.out.println("Tìm ước chung lớn nhất của 2 số:\n");
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("nhập số thứ nhất: ");
		a = sc.nextInt();
		System.out.println("nhập số thứ hai: ");
		b = sc.nextInt();
		System.out.println("ucln của 2 số là: " + greCD.greatestCommonDivisor(a, b));
		System.out.println("\nNhập số nguyên cần tính fibonaci: ");
		int c = sc.nextInt();
		System.out.println("Fibonaci của số " + c + " là: " + fibo.Fibonaci(c));
		sc.close();
	}
}
