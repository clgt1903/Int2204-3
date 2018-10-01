/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;



/**
 *
 * @author My PC
 */
public class Ps {

    
    int tu;
    int mau;
    public Ps(int tu,int mau)
    {
    this.tu=tu;
    this.mau=mau;
    }

   
    public int gettu()
    {
        return tu;
    }
    public int getmau()
    {
        return mau;
    }
    public int uscll(int a , int b)
    {
        int c=0;
         if(a<0)
    {
        a=-a;
    }
    if(b<0)
    {
        b=-b;
    }
        if(a>b)
        {
            for(int i=b;i>=1;i--)
            {
                if((a%i==0)&&(b%i==0))
                {
                    c=i;
                }
            }
        }
        else
        {if(b>a){
            for(int i=a;i>=1;i--)
            {
                if(a%i==0&&b%i==0)
                {
                    c=i;
                }
            }
            
        }
        else
        {
            if(a==b)
            {
                c=a;
            }
        }
        }
        return c;
    }
    public void tong(Ps pso)
    {
        int ts=this.gettu()*pso.getmau()+this.getmau()*pso.gettu();
        int ms=this.getmau()*pso.getmau();
        
         System.out.println(ts/uscll(ts,ms)+"/"+ms/uscll(ts,ms));
        
        
                
    }
     public void hieu(Ps pso)
    {
        int ts=this.gettu()*pso.getmau()-this.getmau()*pso.gettu();
        int ms=this.getmau()*pso.getmau();
       int m=uscll(ts, ms);
         System.out.println(ts/uscll(ts,ms)+"/"+ms/uscll(ts,ms));
                
    }
      public void nhan(Ps pso)
    {
        int ts=this.gettu()*pso.gettu();
        int ms=this.getmau()*pso.getmau();
        
        System.out.println(ts/uscll(ts,ms)+"/"+ms/uscll(ts,ms));
        
                
    }
      public void chia(Ps pso)
    {
        int ts=this.gettu()*pso.getmau();
        int ms=this.getmau()*pso.gettu();
        
        System.out.println(ts/uscll(ts,ms)+"/"+ms/uscll(ts,ms));
        
                
    }
     
     
     
    public static void main(String[] args) {
       Ps mot=new Ps(2,4);
       Ps hai=new Ps(2,4);
      mot.tong(hai);
 
       
    }

  
}