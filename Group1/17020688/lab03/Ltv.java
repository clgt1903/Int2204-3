/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltv;

/**
 *
 * @author My PC
 */
public class Ltv {

    int tuoi;
    String nn;
    String gioitinh;
    String congviec;
    public int gettuoi()
  {
      return tuoi;
  }
   public String getnn()
  {
      return nn;
  }
 
  
 
  public String gioitinh()
  {
      return gioitinh;
  }
   public String getcv()
  {
      return congviec;
  }
  
    public void settuoi(int tuoi) {
		this.tuoi = tuoi;
    }
     
      public void setcv(String congviec) {
		this.congviec =congviec;}
      public void setgioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
     }
       public void setnn(String nn) {
		this.nn = nn;
   }
       
      
    public static void main(String[] args) {
      Ltv d=new Ltv();
      d.setcv("web");
      d.setgioitinh("nu");
      d.setnn("html");
      d.settuoi(24);

    }
    
}
