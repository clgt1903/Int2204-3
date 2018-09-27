package bt1;
import java.util.Scanner;
public class Bt1 {
    public int UCLN(int a, int b) {
        if (a < 0) a = Math.abs(a);
        if (b < 0) b = Math.abs(b);
        if (a == 0) return b;
        else if (b == 0) return a;
        else

            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
        return a;

    }

    public int Fibonaci(int n) {
        if (n == 0) return 0;
        else {
            if (n == 1) return 1;
            else {
                int f1 = 0;
                int f2 = 1;
                int f = 0;
                for (int i = 0; i < n; i++) {
                    f = f1 + f2;
                    f1 = f2;
                    f2 = f;
                }
                return f;
            }
        }

    }

    public static void main(String args[]) {
        Bt1 temp = new Bt1();

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(temp.UCLN(a, b));
        System.out.println("F(" + n + ") = " + temp.Fibonaci(n));
    }
}
