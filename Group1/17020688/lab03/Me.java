/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

/**
 *
 * @author My PC
 */
public class Me {

    int tuoi;
    String que;
    String nghe;
    String ten;
    double cao;
    int nang;
    public int gettuoi()
    {
        return tuoi;
    }
    public String getque()
    {
        return que;
    }
    public String getnghe()
    {
        return nghe;
    }
    public String getten()
    {
        return ten;
        
    }
    public double getcao()
    {
        return cao;
    }
    public int getnang()
    {
        return nang;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi=tuoi;
    }
     public void setcao(int cao)
    {
        this.cao=cao;
    }
      public void setnang(int nang)
    {
        this.nang=nang;
    }
     public void setque(String que)
    {
        this.que=que;
    }
      public void setnghe(String nghe)
    {
        this.nghe=nghe;
    }
       public void setten(String ten)
    {
        this.ten=ten;
    }
    
    public static void main(String[] args) {
 Me d=new Me();
 d.setcao(167);
 d.setnang(57);
 d.setten("duc");
 d.setque("nam dinh");
 d.setnghe("sinh vien,seo web");
 d.settuoi(19);
 
 
    }
    
}
