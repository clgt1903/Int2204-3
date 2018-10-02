package baitaptuan4;

public class baitaptuan4 {
    public static int timmax(int a, int b)
    {
        if (a>b)
            return a;
        return b;
    }
    public static int minArray(int h[])
    {
        int i,min=h[0];
        for(i=0;i<h.length;i++)
        {
            if(h[i]<min)
                min=h[i];
        }
        return min;
    }
    public static String BMI_Test(float w,float h)
    {
        float bmi = (float) (w/(Math.pow(h,2)));
        if(bmi<18.5) return "Thieu can";
        if(bmi<23) return "Binh thuong";
        if(bmi<25) return "Thua can";
        return "Beo phi";
    }

}

