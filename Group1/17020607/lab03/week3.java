package tuan3;
import java.io.PrintStream;

public class week3 { public week3() {}
  public int UCLN(int a, int b) { int a1 = Math.abs(a);
    int b1 = Math.abs(b);
    if (a1 == b1)
    {
      return a1;
    }
    
    while (a1 != b1)
    {
      if (a1 > b1)
      {
        a1 -= b1;
      }
      else {
        b1 -= a1;
      }
    }
    return a1;
  }
  
  public int Fibonacci(int n) {
    if ((n == 0) || (n == 1)) { return n;
    }
    return Fibonacci(n - 1) + Fibonacci(n - 2);
  }
  
  public static void main(String[] args)
  {
    week3 lol = new week3();
    System.out.println("Uớc chung lớn nhất của 5 và 10 là: " + lol.UCLN(5, 10));
    System.out.println("Số Fibonacci thứ 10 là:" + lol.Fibonacci(10));
  }
}
