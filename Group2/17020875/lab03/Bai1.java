import java.util.Scanner;
public class Bai1 {
    public int ucln(int a, int b)
    {
        if(b == 0)
            return a;
        return ucln(b, a%b);
    }
    public int fibonanci(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonanci(n - 1) + fibonanci(n - 2);
    }
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       int a, b, c;
       System.out.print("Moi nhap so a: ");
       a = scan.nextInt();
       System.out.print("Moi nhap so b: ");
       b = scan.nextInt();
       System.out.print("Moi nhap so c: ");
       c = scan.nextInt();

       Bai1 test  = new Bai1();
       int n1 = test.ucln(a, b);
       int n2 = test.fibonanci(c);

       System.out.println("UCLN c?a " + a + " va " + b + ": " + n1);
       System.out.println("Fibonanci thu " + b + ": " + n2);
    }


}