/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family;


public class Family {

    /**
     * @param args the command line arguments
     */
    int tv;
   String dchi;
   String jobfather;
   String jobmother;
   int agefather;
   int agemother;
   public int gettv()
   {
       return tv;
   }
   public int getagefather()
   {
       return agefather;
   }
   public int getagemother()
   {
       return agemother;
   }
   public String getjobfather()
   {
       return jobfather;
   }
           public String getjobmother()
           {
               return jobmother;
           }
    public String getdchi()
    {
        return dchi;
    }
    public void setdchi(String dchi)
    {
        this.dchi=dchi;
    }
     public void setjobfather(String jobfather)
    {
        this.jobfather=jobfather;
    }
       public void setjobmother(String jobmother)
    {
        this.jobmother=jobmother;
    }
    public void settv(int tv)
    {
        this.tv=tv;
    }
    public void setagemother(int agemother)
    {
        this.agemother=agemother;
    }
     public void setagefather(int agefather)
    {
        this.agefather=agefather;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Family d=new Family();
        d.setagefather(45);
        d.setagemother(40);
        d.setdchi("nam dinh");
        d.settv(3);
        d.setjobfather("buon ban");
        d.setjobmother("may mac");
        System.out.println("thanh vien :"+d.gettv());
    }
    
}
    
