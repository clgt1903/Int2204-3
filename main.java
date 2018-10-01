public class main {
    	public static void main(String args[])          //lop chinh de chay chuong trinh
    	{
    		int a=70;
    		int b=45;
    		int n=10;
    		main s=new main();
    		System.out.println("UCLN ("+a+","+b+") = "+ s.UCLN(a,b));
    		System.out.println("Fibonaxi("+n+") = "+s.Fibo(n));
    		
    	}
    	public int UCLN(int a,int b)         //ham tim uoc chung lon nhat
    	{
    		a = Math.abs(a);
    		b = Math.abs(b);
    		if(a>b) return UCLN(a-b,b);
    		else if(b>a) return UCLN(a,b-a);
    		else return a;
    	    
    	}
    	public static int Fibo(int n)             //ham tim so fibonaci thu n
    	{
    		if(n==0||n==1) return 1;
    		else return Fibo(n-2)+Fibo(n-1);
    	}
}
