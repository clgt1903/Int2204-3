/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln1;
import java.util.Scanner;
/**
 *
 * @author CCNE
 */
public class UCLN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,ucln;
        Scanner num= new Scanner(System.in);
        a=num.nextInt();
        b=num.nextInt();
    if(a==0 && b!=0)
	{
            ucln=b;
	}
	else if(a!=0 && b==0)
	{
            ucln=a;
	}
	else 
	{   
         if(a<0){a=-a;}
        if(b<0){b=-b;}
        while(a!=b)
	    {
		if(a>b) {a-=b;}
		else {b-=a;}
	    }
	    ucln=a;
	}
        System.out.println(ucln);
    }
}
    
    
