/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maytinh;

/**
 *
 * @author My PC
 */
public class Maytinh {

    String hang;
    String chip;
    int gia;
    public int getgia()
  {
      return gia;
  }
   public String gethang()
  {
      return hang;
  }
 
  
 
  public String getchip()
  {
      return chip;
  }
   public void setgia(int gia)
    {
        this.gia=gia;
    }
     public void setchip(String chip)
    {
        this.chip=chip;
    }
      public void sethang(String hang)
    {
        this.hang=hang;
    }
    public static void main(String[] args) {
        Maytinh d=new Maytinh();
        d.sethang("dell");
        d.setgia(8000000);
        d.setchip("core i3");
        
    }
    
}
