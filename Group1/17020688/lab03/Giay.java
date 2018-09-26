/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giay;


public class Giay {

    /**
     * @param args the command line arguments
     */
    int gia;
String hang;
int size;
   public int getgia()
  {
      return gia;
  }
   public String gethang()
  {
      return hang;
  }
 
  
 
  public int getsize()
  {
      return size;
  }
  public void setgia(int gia)
    {
        this.gia=gia;
    }
     public void setsize(int size)
    {
        this.size=size;
    }
      public void sethang(String hang)
    {
        this.hang=hang;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Giay d=new Giay();
        d.setgia(300000);
        d.sethang("paladium");
        d.setsize(40);
                
    }
    
}
