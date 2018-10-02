/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Admin
 */
class KhoiTaoPhanSo {
    private int tu;
    private int mau;
    
    public int getTu(){
        return tu;
    }
    public void setTu(int tu){
        this.tu = tu;
        
    }
    public int getMau(){
        return mau;
    }
    public void setMau(int mau){
        this.mau = mau;
        
    }
    
    public KhoiTaoPhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
        if(mau < 0){
            this.mau = this.mau * (-1);
            this.tu = this.tu * (-1);
        }
        if(mau == 0)
            System.exit(0);
    }
    
    public int GCD(int a, int b){
        if(a < 0)
            a = -a;
        if(b < 0)
            b = -b;
        while(a != b){
            if(a > b)
                a -=b;
            else
                b -=a;
        }
        return a;
    }
    
    public void rutGon(){
        int gcd = GCD(this.getTu(), this.getMau());
        this.setTu(this.getTu() / gcd);
        this.setMau(this.getMau() / gcd);
    }
    
    public void congPhanSo(KhoiTaoPhanSo ps){
        int tongTu = this.getTu() * ps.getMau() + this.getMau() * ps.getTu();
        int tongMau = this.getMau() * ps.getMau();
        KhoiTaoPhanSo phansotong = new KhoiTaoPhanSo(tongTu, tongMau);
        System.out.println("Tong hai phan so = " + phansotong.getTu() + "/" + phansotong.getMau());
    }
    
    public void truPhanSo(KhoiTaoPhanSo ps){
        int hieuTu = this.getTu() * ps.getMau() - this.getMau() * ps.getTu();
        int hieuMau = this.getMau() * ps.getMau();
        KhoiTaoPhanSo phansohieu = new KhoiTaoPhanSo(hieuTu, hieuMau);
        System.out.println("Hieu hai phan so = " + phansohieu.getTu() + "/" + phansohieu.getMau());
    }
    
    public void nhanPhanSo(KhoiTaoPhanSo ps){
        int tichTu = this.getTu() * ps.getTu();
        int tichMau = this.getMau() * ps.getMau();
        KhoiTaoPhanSo tichphanso = new KhoiTaoPhanSo(tichTu, tichMau);
        tichphanso.rutGon();
        System.out.println("Tich hai phan so = " + tichphanso.getTu() + "/" + tichphanso.getMau());
    }
    
    public void chiaPhanSo(KhoiTaoPhanSo ps){
        int thuongTu = this.getTu() * ps.getMau();
        int thuongMau = this.getMau() * ps.getTu();
        KhoiTaoPhanSo thuongphanso = new KhoiTaoPhanSo(thuongTu, thuongMau);
        thuongphanso.rutGon();
        System.out.println("Thuong hai phan so = " + thuongphanso.getTu() + "/" + thuongphanso.getMau());
    }
    
    public boolean equals(Object obj){
        if(obj instanceof KhoiTaoPhanSo){
            KhoiTaoPhanSo ps = (KhoiTaoPhanSo)obj; 
            if(this.getTu()*ps.getMau() ==  ps.getTu()*this.getMau())
                return true;
            return false;
        } 
        else 
            return false;
    }
}

public class PhanSo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KhoiTaoPhanSo p1 = new KhoiTaoPhanSo(30,-60);
        p1.rutGon();
        System.out.println(p1.getTu() + "/" + p1.getMau());
        KhoiTaoPhanSo p2 = new KhoiTaoPhanSo(20, 50);
        p2.rutGon();
        System.out.println(p2.getTu() + "/" + p2.getMau());
        
        p1.congPhanSo(p2);
        p1.truPhanSo(p2);
        p1.nhanPhanSo(p2);
        p1.chiaPhanSo(p2);
        boolean compare = p1.equals(p2);
        if(compare != true)
            System.out.println("Hai phan so khong bang nhau!");
        else
            System.out.println("Hai phan so bang nhau!");
    }
    
}
