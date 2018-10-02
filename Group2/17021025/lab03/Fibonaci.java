import java.util.Scanner;
public class Fibonaci
{
    public int TinhF (int n)
    {
        if (n == 0)
            return 0;
        if (n == 1 )
            return 1;
        return TinhF(n-1)+TinhF(n-2);
    }
    public static void main (String[] args)
    {
        Fibonaci fb=new Fibonaci();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = input.nextInt();
        System.out.println(fb.TinhF(n));
    }
}
