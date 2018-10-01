/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;


public class Ham {

    static int max(int a,int b)
{
if(a>b)
return a;
else return b;
}
public static int min(int arr[])
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
String t;
float c=a/(b*b);
if(c<18.5)
{
t ="Thieu can";
}
else if(18.5<=c && c<23)
{
t ="Binh thuong";
}
else if(c>=23 && c<=24.99)
{
t ="Thua can";

}
else 
{
t ="Beo phi";
}
return t;
}    
}
