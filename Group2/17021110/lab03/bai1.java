package bai1;

/**
 *
 * @author CCNE
 */

import java.util.Scanner;
public class Bai1 {
   public int UCLN(int a,int b){
   		int c,d;
       
	 c=Math.abs(a);
        d=Math.abs(b);
      while(c!=d){
            if(c>d)
                 c=c-d;
            else
                d=d-c;
        }
return c;
}
 public  int F(int n)
{
	int f0=0,f1=1,fn=0;
        for(int i=2;i<=n;i++)
        {
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
        
}

    
    public static void main(String[] args) {
      
        int a,b;
        Scanner input = new Scanner(System.in);
         a=input.nextInt();
         b=input.nextInt();
     
        Bai1 u=new Bai1();
         System.out.println(u.UCLN(a,b));
        int n;
        n=input.nextInt();
        System.out.println(u.F(n));
    }
}