package tuan3;

import java.io.PrintStream;

public class Phanso1 { public Phanso1() {}
  
  public static void main(String[] args) { PhanSo p1 = new PhanSo(4, 5);
    PhanSo p2 = new PhanSo(-2, 5);
    p1.Tong(p2);
    p1.Hieu(p2);
    p1.Tich(p2);
    p1.Thuong(p2);
    if (p1.equals(p2))
    {
      System.out.println("Phân Số 1 = Phân Số 2");
    }
    else {
      System.out.println("Phân Số 1 != Phân Số 2");
    }
  }
}
