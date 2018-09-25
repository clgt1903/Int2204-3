/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cty;



public class Cty {

    /**
     * @param args the command line arguments
     */
    int tl;
    int tv;
    String lv;
    String vp;
    String th;
    public int gettl()
    {
        return tl;
    }
     public int gettv()
    {
        return tv;
    }
      public String getlv()
    {
        return lv;
    }
         public String getvp()
    {
        return vp;
    }
      
            public String getth()
    {
        return th;
    }
            public void settl(int tl)
            {
                this.tl=tl;
            }
            public void settv(int tv)
            {
                this.tv=tv;
            }
            public void setlv(String lv)
            {
                this.lv=lv;
            }
            public void setth(String th)
            {
                this.th=th;
            }
            public void setvp(String vp)
            {
                this.vp=vp;
            }
     
            
            
    public static void main(String[] args) {
        Cty d=new Cty();
        d.setlv("thoitrang");
        d.setth("lody");
        d.settv(20);
        d.settl(2017);
        d.setvp("ecolife");
        
        
        
        
        
    }
    
}
