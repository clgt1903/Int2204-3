package comunity.com;

import java.util.Scanner;

public class Bai1 {
	/**
	 * Đây là hàm tìm ước chung lớn nhất của 2 số nguyên a và b 
	 * @param a - số nguyên a
	 * @param b -số nguyên b
	 * @return ước chung lớn nhất 
	 */
	 int uocChungLonNhat (int a ,int b )
	{
		int a1 = Math.abs(a);
		int b1 = Math.abs(b);
		if ( a1 == b1 )
			return a1 ;
		else if (a1 == 0 || b1 == 0)
			return a1 + b1;
		else 
		{
		while (a1 != b1)
		{
			if (a1 > b1)
				a1 -= b1;
			else 
				b1 -= a1;
		}
		return  a1;
		}
	}
	 /**
	  * đây là hàm tính số Fibonacci của 1 số nguyên n
	  * @param n -số nguyên n 
	  * @return -số Fibonacci thứ n
	  */
	int Fibonacci (int n )
	{
		if (n == 0 )
			return 0 ;
		else if (n == 1 )
			return 1 ;
		else 
			return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai1 b1 = new Bai1();
		Scanner sc = new Scanner (System.in);
		System.out.println("Mời bạn nhập a :");
		int a = sc.nextInt();
		System.out.println("Mời bạn nhập b :");
		int b = sc.nextInt();
		System.out.println("Ước chung lớn nhât của "+ a+" và "+b+" là :" +b1.uocChungLonNhat(a,b) );
		System.out.println("Mời bạn nhập n :");
		int n = sc.nextInt();
		System.out.println("Số Fibonacci thứ "+n +" là : "+b1.Fibonacci(n));
		
	}

}
