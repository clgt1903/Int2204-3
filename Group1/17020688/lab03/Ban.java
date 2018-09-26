/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ban;

/**
 *
 * @author My PC
 */
public class Ban {
    
    
    String name;
   int tuoi;
   String sothich;
   
   public int gettuoi()
  {
      return tuoi;
  }
   public String name()
  {
      return name;
  }
 
  
 
  public String sothich()
  {
      return sothich;
  }

     
      public void settuoi(int tuoi) 
      {
		this.tuoi =tuoi;}
      public void setname(String name) {
		this.name = name;
     }
       public void setsothich(String sothich) {
		this.sothich = sothich;
   }
      
  
        public static void main(String[] args) {
        // TODO code application logic here
        Ban d=new Ban();
        d.setname("anh");
        d.settuoi(19);
        d.setsothich("game");
        
    }
    
}
