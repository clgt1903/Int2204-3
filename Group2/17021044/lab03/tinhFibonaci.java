
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class tinhFibonaci {
    public int Fibonaci(int n){
        int arr[] = new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2; i<n; i++)
        {
            arr[i]=arr[i-1] + arr[i-2];
        }
        
        return arr[n-1];
    }
    public static void main(String[] args) {
        tinhFibonaci fb=new tinhFibonaci();
        
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println(fb.Fibonaci(n));
    }
    }
    

