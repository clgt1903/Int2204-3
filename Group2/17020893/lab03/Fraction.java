package JavaWeek3;

public class Fraction {
	private int numerator, denominator;
	Ex1 ex1 = new Ex1();

	public int getNumerator() {
		return this.numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	// in ra hình dạng phân số
	public String getFraction() {
		return getNumerator() + "/" + getDenominator();
	}

	// Tối giản phân số
	public String simplifyFraction(Fraction a) {
		int simplifyNumerator = a.getNumerator() / ex1.greatestCommonDivisor(a.getNumerator(), a.getDenominator());
		int simplifyDenominator = a.getDenominator() / ex1.greatestCommonDivisor(a.getNumerator(), a.getDenominator());
		return simplifyNumerator + "/" + simplifyDenominator;
	}

	// phép cộng phân số
	public void addFraction(Fraction a, Fraction b) {
		// formula: a/b + c/d = ( ad + bc ) / bd
		int ad = a.getNumerator() * b.getDenominator();
		int bc = a.getDenominator() * b.getNumerator();
		int bd = a.getDenominator() * b.getDenominator();
		if ((double) a.getNumerator() / b.getNumerator() == (double) -a.getDenominator() / b.getDenominator())
			System.out.println(a.getFraction() + " + " + b.getFraction() + " = 0");
		else {
			int simplifyNumerator = (ad + bc) / ex1.greatestCommonDivisor((ad + bc), bd);
			int simplifyDenominator = bd / ex1.greatestCommonDivisor((ad + bc), bd);
			String result = simplifyNumerator + "/" + simplifyDenominator;
			if ((ad + bc) % bd == 0)
				System.out.println(a.getFraction() + " + " + b.getFraction() + " = " + (ad + bc) / bd);
			else
				System.out.println(a.getFraction() + " + " + b.getFraction() + " = " + result);
		}
	}

	// phép trừ phân số
	public void subtractFraction(Fraction a, Fraction b) {
		// formula: a/b - c/d = ( ad - bc ) / bd
		int ad = a.getNumerator() * b.getDenominator();
		int bc = a.getDenominator() * b.getNumerator();
		int bd = a.getDenominator() * b.getDenominator();
		if ((double) a.getNumerator() / b.getNumerator() == (double) a.getDenominator() / b.getDenominator())
			System.out.println(a.getFraction() + " - " + b.getFraction() + " = 0");
		else {
			int simplifyNumerator = (ad - bc) / ex1.greatestCommonDivisor((ad - bc), bd);
			int simplifyDenominator = bd / ex1.greatestCommonDivisor((ad - bc), bd);
			String result = simplifyNumerator + "/" + simplifyDenominator;
			if ((ad - bc) % bd == 0)
				System.out.println(a.getFraction() + " - " + b.getFraction() + " = " + (ad - bc) / bd);
			else
				System.out.println(a.getFraction() + " - " + b.getFraction() + " = " + result);
		}
	}

	// phép nhân phân số
	public void multiplyByFraction(Fraction a, Fraction b) {
		// formula: a/b * c/d = ac / bd
		int ac = a.getNumerator() * b.getNumerator();
		int bd = a.getDenominator() * b.getDenominator();
		int simplifyNumerator = ac / ex1.greatestCommonDivisor(ac, bd);
		int simplifyDenominator = bd / ex1.greatestCommonDivisor(ac, bd);
		String result = simplifyNumerator + "/" + simplifyDenominator;
		if (ac % bd == 0)
			System.out.println(a.getFraction() + " - " + b.getFraction() + " = " + ac / bd);
		else
			System.out.println(a.getFraction() + " * " + b.getFraction() + " = " + result);
	}

	// phép chia phân số
	public void divideByFraction(Fraction a, Fraction b) {
		// formula: a/b : c/d = ad/bc
		int ad = a.getNumerator() * b.getDenominator();
		int bc = a.getDenominator() * b.getNumerator();
		int simplifyNumerator = ad / ex1.greatestCommonDivisor(ad, bc);
		int simplifyDenominator = bc / ex1.greatestCommonDivisor(ad, bc);
		String result = simplifyNumerator + "/" + simplifyDenominator;
		if (ad % bc == 0)
			System.out.println(a.getFraction() + " : " + b.getFraction() + " = " + ad / bc);
		else
			System.out.println(a.getFraction() + " : " + b.getFraction() + " = " + result);
	}

	// So sánh phân số
	public boolean equals(Fraction a, Fraction b) {
		if (a.numerator*b.denominator == a.denominator*b.numerator)
			return true;
		else
			return false;
	}
}
