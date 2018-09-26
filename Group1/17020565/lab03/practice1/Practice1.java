import java.util.Scanner;
import java.lang.Math;

public class Practice1 {
    public static void main(String[] args) {
        Practice1 practice = new Practice1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("UCLN cua a va b la: " + practice.UCLN(a, b));

        System.out.println("Nhap so can tinh fibonaxi: ");
        int c = scanner.nextInt();
        System.out.println("So fibonaxi la: " + practice.CalcFibonaxi(c));
    }

    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return a + b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public int CalcFibonaxi(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else return CalcFibonaxi(n-1) + CalcFibonaxi(n - 2);
    } 
}