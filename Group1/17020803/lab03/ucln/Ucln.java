/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln;

/**
 *
 * @author Windows 81
 */


import java.util.Scanner;

public class Ucln {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        
        b = sc.nextInt();
        while( a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else if(a<b)
            {
                b=b-a;
            }
        } 
        System.out.println(a);
        // TODO code application logic here
        
}
}