public class Challenges 
{
   public int GCD(int a , int b)
		{
		
    		int temp;
    			while (b != 0) 
    			{
        			temp = a % b;
        		a = b;
        			b = temp;
    			}
    			return a;
		}

   public static int fibo(int c)
	{
		if(c==0) return 0;
		if(c==1) return 1;
		else return fibo(c-1)+fibo(c-2);
	}
   public static void main (String[] args)
		{
			Challenges n=new Challenges();
			System.out.println(n.GCD(6,36));
			System.out.println(n.fibo(3));
		}
}
