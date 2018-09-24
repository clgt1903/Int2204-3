package JavaWeek3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Fraction fraction1 = new Fraction();
		Fraction fraction2 = new Fraction();
		Fraction result = new Fraction();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Tử số của phân số thứ nhất là: ");
		int Numerator1 = sc.nextInt();
		System.out.print("Mẫu số của phân số thứ nhất là: ");
		int Denominator1 = sc.nextInt();
		System.out.print("Tử số của phân số thứ hai là: ");
		int Numerator2 = sc.nextInt();
		System.out.print("Mẫu số của phân số thứ hai là: ");
		int Denominator2 = sc.nextInt();

		fraction1.setNumerator(Numerator1);
		fraction1.setDenominator(Denominator1);
		fraction2.setNumerator(Numerator2);
		
		fraction2.setDenominator(Denominator2);

		result.addFraction(fraction1, fraction2);
		result.subtractFraction(fraction1, fraction2);
		result.multiplyByFraction(fraction1, fraction2);
		result.divideByFraction(fraction1, fraction2);
		System.out.println("\n");
		// test equals
		if (result.equals(fraction1, fraction2) == true)
			System.out.print(fraction1.getFraction() + " = " + fraction2.getFraction());
		else
			System.out.print(fraction1.getFraction() + " != " + fraction2.getFraction());

		sc.close();
	}
}
