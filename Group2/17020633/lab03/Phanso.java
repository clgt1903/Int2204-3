/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Phanso {
    
    private int tu;
    private int mau;
    
    public int getTu()
    {
        return tu;
    }
    public void setTu(int a)
    {
        this.tu=a;
    }
    public int getMau()
    {
        return mau;
    }
    public void setMau(int a)
    {
        this.mau=a;
    }
    public Phanso(int tu,int mau)
    {
        this.tu=tu;
        this.mau=mau;
        if(mau<0)
        {
            mau=mau*(-1);
            tu=tu*(-1);
        }
    }
    public int UCLN(int a,int b)
    {
        while (a!=b)
        {
            if(a < 0)
                a = -a;
            if(b < 0)
                b = -b;
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void Rutgon()
    {
        int ucln=UCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/ucln);
        this.setMau(this.getMau()/ucln);
    }
    public void truhaiphanso(Phanso Pso)
    {
        int hieucuatu=this.getTu()*Pso.getMau()-this.getMau()*Pso.getTu();
        int hieucuamau=this.getMau()*Pso.getMau();
        Phanso hieuphanso=new Phanso(hieucuatu,hieucuamau);
        System.out.println(hieuphanso.getTu()+"/"+hieuphanso.getMau());
    }
    public void conghaiphanso(Phanso Pso)
            
    {
        int tongcuatu=this.getTu()*Pso.getMau()+this.getMau()*Pso.getTu();
        int tongcuamau=this.getMau()*Pso.getMau();
        Phanso tongphanso=new Phanso(tongcuatu,tongcuamau);
        System.out.println(tongphanso.getTu()+"/"+tongphanso.getMau());
    }
    
    public void nhanhaiphanso(Phanso Pso)
    {
        int tichtu=this.getTu()*Pso.getTu();
        int tichmau=this.getMau()*Pso.getMau();
        Phanso tichphanso=new Phanso(tichtu,tichmau);
        tichphanso.Rutgon();
        System.out.println(tichphanso.getTu()+"/"+tichphanso.getMau());
    }
     public void chiahaiphanso(Phanso Pso)
    {
        int thuongtu=this.getTu()*Pso.getMau();
        int thuongmau=this.getMau()*Pso.getTu();
        Phanso thuongphanso=new Phanso(thuongtu,thuongmau);
        thuongphanso.Rutgon();
        System.out.println(thuongphanso.getTu()+"/"+thuongphanso.getMau());
    }
     public boolean equals(Object obj)
     {
         
         if( obj instanceof Phanso )
         {
             Phanso Pso=(Phanso )obj;
             if((this.getTu()*Pso.getMau())==(this.getMau()*Pso.getTu()))
                 return true;
             else 
                 return false;
             
         }
         else
             return false;
             
     }
}
     