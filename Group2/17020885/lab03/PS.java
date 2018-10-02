/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

import java.util.*;
/**
 *
 * @author Dell
 */
    public class PS {
    private int tu;
    private int mau;

    public PS() {
        this.tu = tu;
        this.mau = mau;
    }
    
    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public int UCLN(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else b=b-a;
        }
     return a;   
    }
    public void cong(PS ps1,PS ps2){
        int tu1=ps1.tu*ps2.mau+ps2.tu*ps1.mau;
        int mau1=ps1.mau*ps2.mau;
       
        if(tu1==0){
            System.out.println("PS1+PS2=0");
        }
        else if(tu1%mau1==0){
            System.out.println("PS1+PS2="+tu1/mau1);
        }
        else{
        System.out.println("PS1+PS2="+tu1/UCLN(Math.abs(tu1),Math.abs(mau1))+"/"
                +mau1/UCLN(Math.abs(tu1),Math.abs(mau1)));
        }
    }
    
    public void tru(PS ps1,PS ps2){
        int tu2=ps1.tu*ps2.mau-ps2.tu*ps1.mau;
        int mau2=ps1.mau*ps2.mau;
        if(tu2==0){
            System.out.println("PS1-PS2=0");}
        else if(tu2%mau2==0){
            System.out.println("PS1-PS2="+tu2/mau2);
        }
        else{
        System.out.println("PS1-PS2="+tu2/UCLN(Math.abs(tu2),Math.abs(mau2))+"/"
                +mau2/UCLN(Math.abs(tu2),Math.abs(mau2)));}  
        
    }
    public void nhan(PS ps1,PS ps2){
        int tu3=ps1.tu*ps2.tu;
        int mau3=ps1.mau*ps2.mau;
         if(tu3%mau3==0){
            System.out.println("PS1*PS2="+tu3/mau3);
        }
         System.out.println("PS1*PS2="+tu3/UCLN(Math.abs(tu3),Math.abs(mau3))+"/"
                 +mau3/UCLN(Math.abs(tu3),Math.abs(mau3)));
    }
    public void chia(PS ps1, PS ps2){
        int tu4=ps1.tu*ps2.mau;
        int mau4=ps1.mau*ps2.tu;
        if(tu4%mau4==0){
            System.out.println("PS1/PS2="+tu4/mau4);
        } else{
         System.out.println("PS1/PS2="+tu4/UCLN(Math.abs(tu4),Math.abs(mau4))+"/"
                 +mau4/UCLN(Math.abs(tu4),Math.abs(mau4)));
         }
        
    }
    public boolean equals(Object a){
         if(a instanceof PS){
            if(((PS) a).mau*this.tu==((PS) a).tu*this.mau){
                return true;
        }
        }
        
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,c,d;
        PS ps=new PS();
        Scanner sc= new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        PS ps1=new PS();
        ps1.tu=a;
        ps1.mau=b;
        PS ps2=new PS();
        ps2.tu=c;
        ps2.mau=d;
        /*System.out.println("PS1: "+ps1.tu+"/"+ps1.mau);
        System.out.println("PS1: "+ps2.tu+"/"+ps2.mau);*/
        
        ps.cong(ps1, ps2);
         ps.tru(ps1, ps2);
         ps.nhan(ps1, ps2);
        ps.chia(ps1, ps2);
        
         if(ps1.equals(ps2)==true)
             System.out.println("Hai phan so bang nhau");
         else System.out.println("Hai phan so khong bang nhau");
        // TODO code application logic here
           
}
    
}
