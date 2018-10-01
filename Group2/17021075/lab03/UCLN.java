import java.util.Scanner;
import java.util.*;
public class UCLN
{
    public int UCLN(int a,int b)
    {
		a=Math.abs(a);
		b=Math.abs(b);
        if(a==b)
			return a;
        else
			if(a>b)
				return UCLN(a-b,b);
			else
				return UCLN(a,b-a);
    }
    public static void main(String[] args)
    {
		UCLN u=new UCLN();
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao a, b: ");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println(u.UCLN(a,b));
    }

}
