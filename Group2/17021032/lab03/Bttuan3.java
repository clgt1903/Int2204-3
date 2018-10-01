/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan3;

/**
 *
 * @author thang
 */
public class Bttuan3 {

     public int UCLN(int a, int b){
    if(b==0) 
        return a;
    else
        return UCLN(b,a % b);
    
}
     public int Fibo(int n){
         if (n==0) return 0;
         if (n==1) return 1;
         return Fibo(n-1)+Fibo(n-2);
     }
     
     
     
     
     
    public static void main(String[] args) {
        // TODO code application logic here
        Bttuan3 abc = new Bttuan3();
        System.out.println(abc.UCLN(65, 15));
        System.out.println(abc.Fibo(2));
        
        PS Ps1 = new PS();
        PS Ps2 = new PS();
        Ps1.KhoiTao(3, 6);
        Ps2.KhoiTao(1, 2);
        Ps1.xuat();
        Ps2.xuat();
        System.out.println(Ps1.equals(Ps2));
        Ps1.cong(Ps2);
        Ps1.tru(Ps2);
        Ps1.nhan(Ps2);
        Ps1.chia(Ps2);
        
        
    }
    
}
class my_book{
    private String ten;
    private String theloai;
    private String sotrang;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getSotrang() {
        return sotrang;
    }

    public void setSotrang(String sotrang) {
        this.sotrang = sotrang;
    }
}
class conmeo{
    private String ten;
    private String mau;
    private String gioitinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}
class laptrinhvien{
    private String Ngonngu;
    private String ten;

    public String getNgonngu() {
        return Ngonngu;
    }

    public void setNgonngu(String Ngonngu) {
        this.Ngonngu = Ngonngu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}