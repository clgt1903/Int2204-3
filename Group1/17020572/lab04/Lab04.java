/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Admin
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int greaterNum(int a,int b)
    {
        if(a>=b) return a;
        else return b;
    }
    public static int minArr(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<= min) min= arr[i];
        }
        return min;
    }
    public static String BMI(double hei, int wei)
    {
        double bmi=wei/(hei*hei);
        if(bmi<18.5) return "Thieu Can";
        if(bmi>=18.5 && bmi<23) return "Binh Thuong";
        if(bmi>=23 && bmi<25) return "Thua Can";
        else return "Beo Phi";
        
    }

}
