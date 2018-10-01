package tuan3;
public class Tuan3 {
    // Ham tim UCLN cua 2 so nguyen a va b
    int UCLN (int a, int b)
    {
        a = Math.abs (a);
        b = Math.abs(b);
        
        if (a == b)
        {
            return a;
        }
        else {
            while (a != b)
            {
                if (a > b)
                {
                     a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            return a;
        }
    }
    // Ham tinh fibonacci cua mot so nguyen
    public int Fibo (int n)
    {
       if (n == 0 || n == 1)
       {
           return n;
       }
       else {
           return Fibo(n - 1) + Fibo(n - 2);
       }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Tuan3 la = new Tuan3();
       System.out.println(la.UCLN(5, 10));
       System.out.println(la.Fibo(5));
    }
}