import java.util.Scanner;
public class UCLN
{
    public int ucln(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        UCLN gcd=new UCLN();
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Nhâp a, b: ");
        a=input.nextInt();
        b=input.nextInt();
        System.out.print(gcd.ucln(a,b));
    }
}
