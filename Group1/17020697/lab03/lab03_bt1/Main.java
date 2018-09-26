package lab03_bt1;

public class Main {
	static int UCLN(int a, int b) {
		int temp;
	    while (b != 0) 
	    {
	        temp = a % b;
	        a = b;
	        b = temp;
	    }
		return a;
	}
	
	
	static int Fibonaci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return Fibonaci(n-1)+Fibonaci(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -15;
		int b = 5;
		int n = 8;
		System.out.println("UCLN cua a va b la: "+ UCLN(a,b));
		System.out.println("Fibonaci cua n la: " + Fibonaci(n)); 
	}

}
