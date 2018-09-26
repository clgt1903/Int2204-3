/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaovien;

/**
 *
 * @author My PC
 */
public class Giaovien {

    int tuoi;
    String mon;
   String gioitinh;
  String ten;
 
   public int gettuoi()
  {
      return tuoi;
  }
   public String mon()
  {
      return mon;
  }
 
  
 
  public String gioitinh()
  {
      return gioitinh;
  }
   public String getten()
  {
      return ten;
  }
  
    public void settuoi(int tuoi) {
		this.tuoi = tuoi;
    }
     
      public void setmon(String mon) {
		this.mon =mon;}
      public void setgioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
     }
       public void setten(String ten) {
		this.ten = ten;
   }
      
 public void getinfo()
 {
     System.out.println("tuoi :"+tuoi);
      System.out.println("mon :"+mon);
       System.out.println("gioi tinh:"+ gioitinh);
       
     System.out.println("ten:"+ ten);
 }

    
    
    public static void main(String[] args) {
       Giaovien d=new Giaovien();
        d.setten("duc");
        d.setgioitinh("nam");
        d.setmon("toan");
        d.settuoi(23);
        d.getinfo();
    
        
        
     
    }
    
}
