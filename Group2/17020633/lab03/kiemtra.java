/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class kiemtra {
     public static void main(String[] args)
     {
         Phanso ps1=new Phanso(10,40);
         ps1.Rutgon();
         Phanso ps2=new Phanso(10,40);
         ps2.Rutgon();
         System.out.println(ps1.getTu()+"/"+ps2.getMau());
         System.out.println(ps2.getTu()+"/"+ps2.getMau());
         ps1.conghaiphanso(ps2);
         ps1.truhaiphanso(ps2);
         ps1.chiahaiphanso(ps2);
         ps1.nhanhaiphanso(ps2);
         boolean sosanh= ps1.equals(ps2);
         if(sosanh==true)
         {
             System.out.println("hai phan so bang nhau!");
         }
         else
             System.out.println("hai phan so khong bang nhau!");
     }
    
}
