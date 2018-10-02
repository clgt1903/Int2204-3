package week4;

public class Week4 {
    public static int Maxab(int a, int b){
        int x = 0 ;
        if(a>b)x=a;
        else if(a<b)x=b;
           return x;
    }
 public static int Minarr(int arr[]){
     int i,min=arr[0];
     for(i=0;i<arr.length;i++){
         if(min>arr[i])min=arr[i];
     }
    return min;
    }


    public static String bmi(double x, double y){
     String m = null ;
     if(x/y/y<18.5)m="thieu can";
     else if(x/y/y>=18.5&x/y/y<23)m="binh thuong";
     else if(x/y/y>=23&x/y/y<25)m="thua can";
     else if(x/y/y>=25)m="beo phi";
    return m; 
 }

}