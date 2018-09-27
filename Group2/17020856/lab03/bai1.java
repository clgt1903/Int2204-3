
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        int a, b, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        System.out.println("Uoc chung lon nhant cua a va b: " + ucln(Math.abs(a),Math.abs(b)));
        System.out.println("So fibonaci thu n: " + fibonaci(n));
    }

    public static int fibonaci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return n;
        else
            return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static int ucln(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return ucln(a - b, b);
        else
            return ucln(a, b - a);
    }
}