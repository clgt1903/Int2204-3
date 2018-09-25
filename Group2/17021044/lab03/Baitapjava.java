/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitapjava {
    public int timUoc(int a,int b)
    {
        if(a <0 ) a= -a;
        if(b <0)  b=-b;
        while(a!=b)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
                b = b - a;
        }
        return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Baitapjava tu = new Baitapjava();
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(tu.timUoc(a, b));
        //System.out.println(UCLN);
    }
    
}
