/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    private int tu,mau;
    public Bai2(int tu, int mau) {
       this.tu=tu;
       this.mau=mau;
    }
    
    public void setTU(int tu) {
            this.tu=tu;
    }
    public int getTu(int tu) {
        return tu;
    }
    public void setMau(int mau) {
        this.mau=mau;
    }
    public int getMau(int mau) {
        return mau;
    }
    
    public int ucln(int a,int b) {
        if(a==b)
            return a;
        else if(a>b)
        {
            a=a-b;
            return ucln(a,b);
        }
        else
        {
            b=b-a;
            return ucln(a,b);
        }
    }
    
    public void cong(Bai2 ps) {
        int ts,ms;
        ts=this.tu * ps.mau + this.mau * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void tru(Bai2 ps) {
        int ts,ms;
        ts=this.tu * ps.mau - this.mau * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void nhan(Bai2 ps) {
        int ts,ms;
        ts=this.tu * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void chia(Bai2 ps) {
        int ts,ms;
        if(ps.tu==0) {
            System.out.println("khong chia duoc");
        }
        else {
        ts=this.tu * ps.tu + this.mau * ps.mau;
        ms=this.mau * ps.tu;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
        }
    }


    
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tuso1,mauso1,tuso2,mauso2;
        tuso1=sc.nextInt();
        mauso1=sc.nextInt();
        tuso2=sc.nextInt();
        mauso2=sc.nextInt();
        Bai2 ps1 = new Bai2(tuso1,mauso1);
        Bai2 ps2 = new Bai2(tuso2,mauso2);
        
        ps1.cong(ps2);
        System.out.println();
        ps1.tru(ps2);
        System.out.println();
        ps1.nhan(ps2);
        System.out.println();
        ps1.chia(ps2);
        System.out.println(); 
        
    }
    
}