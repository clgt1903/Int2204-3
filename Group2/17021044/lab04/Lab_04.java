/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

/**
 *
 * @author Admin
 */
public class Lab_04 {
    public static int giatrimax(int a, int b)
    {
        if(a > b)
            return a;
        else
            return b;
    }
    public static int giaTriMinArr(int arr[])
    {
        int min = arr[0];
        for(int i = 1;i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static String chiSoBMI(double weight, double high)
    {
        String str = null;
        double bmi = weight / (high * high);
        if(bmi < 18.5)
            str = "Thieu can";
        if(bmi >= 18.5 && bmi <= 23)
            str = "Binh thuong";
        if(bmi > 23 && bmi <=25)
            str = "Thua can";
        if(bmi > 25)
            str = "Beo phi";
        
        return str;
    }
   
}




    

