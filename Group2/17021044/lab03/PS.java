
import com.sun.javafx.css.SizeUnits;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PS {
    private int mau,tu;
    public  PS(int tu, int mau)
    {
        this.tu = tu;
        this.mau =mau;
    }
    public void setTu(int tu)
    {
        this.tu = tu;
    }
    public int getTu()
    {
       return this.tu;
    }
    public void setMau(int mau)
    {
        this.mau = mau;
    }
    public int getMau()
    {
        return this.mau;
    }
    public int timUCLN(int a, int b)
    {
        while(a!=b)
        {
            if(a > b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void toiGianPhanSo()
    {
        int i = timUCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }
    public void congPhanSo(PS p)
    {
        int TS = this.getTu() * p.getMau() + this.getMau() * p.getTu();
        int MS = this.getMau() * p.getMau();
        PS phanSoTong = new PS(TS, MS);
        phanSoTong.toiGianPhanSo();
        System.out.println(phanSoTong.tu + "/" + phanSoTong.mau);
        
    }
    public void truPhanSO(PS p)
    {
        int TS = this.getTu() * p.getMau() - this.getMau()* p.getTu();
        int MS = this.getMau() * p.getMau();
        PS hieuPhanSo = new PS(TS, MS);
        hieuPhanSo.toiGianPhanSo();
        System.out.println(hieuPhanSo.tu + "/" + hieuPhanSo.mau);
    }
    public void nhanPhanSo(PS p)
    {
        int TS = this.getTu() * p.getTu();
        int MS = this.getMau() * p.getMau();
        PS phanSoTich = new PS(TS, MS);
        phanSoTich.toiGianPhanSo();
        System.out.println(phanSoTich.tu + "/" + phanSoTich.mau);
    }
    public void chiaPhanSo(PS p)
    {
        int TS = this.getTu() * p.getMau();
        int MS = this.getMau() * p.getTu();
        PS thuongPhanSo = new PS(TS, MS);
        thuongPhanSo.toiGianPhanSo();
        System.out.println(thuongPhanSo.tu + "/" + thuongPhanSo.mau);
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof PS)
        {
            PS other =(PS)obj;
            if(other.getTu() * this.getMau() == other.getMau() * this.getTu())
                return true;
            else return false;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int tu1,mau1,tu2,mau2;
        tu1 =scanner.nextInt();
        mau1=scanner.nextInt();
        tu2 =scanner.nextInt();
        mau2=scanner.nextInt();
        
        PS s1 = new PS(tu1, mau1);
        PS s2 = new PS(tu2, mau2);
//        s1.congPhanSo(s2);
//        s1.truPhanSO(s2);
//        s1.nhanPhanSo(s2);
//        s1.chiaPhanSo(s2);
          if(s1.equals(s2))
              System.out.println("2 phan so bang nhau");
    }
}

