package tuan3;

import java.io.PrintStream;

public class PhanSo {
  public int getTu() { return Tu; }
  
  public int getMau() {
    return Mau;
  }
  
  public void setTu(int tu) { Tu = tu; }
  
  private int Tu;
  public void setMau(int mau) { Mau = mau; }
  
  public PhanSo(int TuSo, int Mauso) {
    Tu = TuSo;
    Mau = Mauso;
  }
  
  public int UCLN(int a, int b) { int a1 = Math.abs(a);
    int b1 = Math.abs(b);
    while (a1 != b1)
    {
      if (a1 < b1) {
        b1 -= a1;
      }
      else {
        a1 -= b1;
      }
    }
    return a1;
  }
  
  public String getPhanSo() { if ((Tu == 0) || (Mau == 1)) {
      return " " + getTu();
    }
    
    if (Math.abs(Tu) == Math.abs(Mau)) {
      return " " + Tu / Mau;
    }
    
    return getTu() + "/" + getMau();
  }
  

  private int Mau;
  public void RutGon()
  {
    int x = UCLN(getTu(), getMau());
    setTu(getTu() / x);
    setMau(getMau() / x);
  }
  
  public void Tong(PhanSo p2) {
    int Mauso = Mau * Mau;
    int Tuso = Tu * Mau + Mau * Tu;
    PhanSo Tong = new PhanSo(Tuso, Mauso);
    Tong.RutGon();
    System.out.println("Tổng 2 phân số là: " + Tong.getPhanSo());
  }
  
  public void Hieu(PhanSo p2) {
    int Mauso = Mau * Mau;
    int Tuso = Tu * Mau - Mau * Tu;
    PhanSo Hieu = new PhanSo(Tuso, Mauso);
    Hieu.RutGon();
    System.out.println("Hiệu 2 phân số là: " + Hieu.getPhanSo());
  }
  
  public void Tich(PhanSo p2) {
    int Mauso = Mau * Mau;
    int Tuso = Tu * Tu;
    PhanSo Tich = new PhanSo(Tuso, Mauso);
    Tich.RutGon();
    System.out.println("Tích 2 phân số là: " + Tich.getPhanSo());
  }
  
  public void Thuong(PhanSo p2) {
    int Mauso = Mau * Tu;
    int Tuso = Tu * Mau;
    PhanSo Thuong = new PhanSo(Tuso, Mauso);
    Thuong.RutGon();
    System.out.println("Thương 2 phân số là: " + Thuong.getPhanSo());
  }
  
  public boolean equals(Object obj) {
    if ((obj instanceof PhanSo))
    {
      PhanSo other = (PhanSo)obj;
      if (Tu * Mau == Tu * Mau)
      {
        return true;
      }
      
      return false;
    }
    
    return false;
  }
}
