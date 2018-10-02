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
public class PS {
    private int tu;
    private int mau;
    public void KhoiTao(int temp1,int temp2){
        Bttuan3 abc = new Bttuan3();
        if(temp2==0){
            System.out.println("Bao loi: Mau phai khac 0");
            System.exit(0);
        }
        int temp = abc.UCLN(Math.abs(temp1),Math.abs(temp2));
        this.tu=temp1/temp;
        this.mau=temp2/temp;
        
        
    }
    public void xuat(){
        if (tu==0) System.out.println("gia tri: "+0);
        else if (tu==mau) System.out.println("gia tri: "+1);
        else System.out.println("gia tri: "+tu+"/"+mau);
    }
    public boolean equals(Object obj){
        if (obj instanceof PS){
        PS temp=(PS)obj;
        if (tu==temp.tu) 
        if (mau==temp.mau) return true;
        }
        return false;
    }
    public void cong(PS obj){
        Bttuan3 abc = new Bttuan3();
        int TempTu=tu*obj.mau+obj.tu*mau;
        int TempMau=mau*obj.mau;
        
        int temp = abc.UCLN(Math.abs(TempTu),Math.abs(TempMau));
        if (TempTu==0) System.out.println(0);
        else if (TempTu==TempMau) System.out.println(1);
        else System.out.println(TempTu/temp+"/"+TempMau/temp);
    }
    public void tru(PS obj){
        Bttuan3 abc = new Bttuan3();
        int TempTu=tu*obj.mau-obj.tu*mau;
        int TempMau=mau*obj.mau;
        
        int temp = abc.UCLN(Math.abs(TempTu),Math.abs(TempMau));
        if (TempTu==0) System.out.println(0);
        else if (TempTu==TempMau) System.out.println(1);
        else System.out.println(TempTu/temp+"/"+TempMau/temp);
    }
    public void nhan(PS obj){
       Bttuan3 abc = new Bttuan3();
        int TempTu=tu*obj.tu;
        int TempMau=mau*obj.mau;
        
        int temp = abc.UCLN(Math.abs(TempTu),Math.abs(TempMau));
        if (TempTu==0) System.out.println(0);
        else if (TempTu==TempMau) System.out.println(1);
        else System.out.println(TempTu/temp+"/"+TempMau/temp);
    }
    public void chia(PS obj){
        Bttuan3 abc = new Bttuan3();
        int TempTu=tu*obj.mau;
        int TempMau=mau*obj.tu;
        
        int temp = abc.UCLN(Math.abs(TempTu),Math.abs(TempMau));
        if (TempTu==0) System.out.println(0);
        else if (TempTu==TempMau) System.out.println(1);
        else System.out.println(TempTu/temp+"/"+TempMau/temp);
    }
}
