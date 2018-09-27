package ucln;

import java.util.Scanner;
public class UCLN
{
    public static int ucln(int a,int b)
    {
        int temp;
        while(b!=0)
        {
            temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Nhập a , b: ");
        a=input.nextInt();
        b=input.nextInt();
        System.out.print(ucln(a,b));
    }

}
