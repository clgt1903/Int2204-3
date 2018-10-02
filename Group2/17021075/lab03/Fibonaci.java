import java.util.Scanner;
public class Fibonaci
{
    public int Fibonaci(int n)
    {
        int num0=0,num1=1,num = 0,i;
		for(i=2;i<=n;i++){
			num=num0+num1;
			num0=num1;
			num1=num;
		}	
        return num;
    }
	public static void main(String[] args)
		{
		Fibonaci fb=new Fibonaci();
		Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n=input.nextInt();
        System.out.println(fb.Fibonaci(n));
    }

}