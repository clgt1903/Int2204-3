/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 123456789
 */
public class Week3 {
    public void  ucln(int a, int b){
    a = Math.abs(a);
    b = Math.abs(b);
    while(a!=b){
        if(a>b) a-=b;
        else b-=a;
    }
    System.out.println(a);
    }
    
    public void fibonaci(int n){
        int f0=0;
        int f1=1;
        System.out.print(f0+" "+f1+" ");
        for(int i=2;i<n;i++){
            f1+=f0;
            f0=f1-f0;
            System.out.print(f1+" ");
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Week3 a = new Week3();
        a.ucln(-15,5);
        a.fibonaci(10);
    }
    
}
