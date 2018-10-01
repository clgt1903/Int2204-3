/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtln;

import java.util.Scanner;
import java.util.Arrays;
public class GTLN {

        static int[] arr;
        static int max(int a,int b)
        {
            if(a>b)
            return a;
            else return b;
        }
        static int min(int[] arr)
        {
            int min=arr[0];
            for(int i=0;i<arr.length;i++)
            {
            if(arr[i]<min)
            min=arr[i];
            }
            return min;
        }

        static String BMI(float a,float b)
        {
            float c=a/b/b;
            if(c<18.5)
            {
            String t="Thieu can";
            return t;
            }
            else if(18.5<=c && c<=22.99)
            {
            String bt="Binh thuong";
            return bt;
            }
            else if(c>=23 && c<=24.99)
            {
            String tc="Thua can";
            return tc;
            }
            else 
            {
            String bp="Beo phi";
            return bp;
            }
        }
    }


