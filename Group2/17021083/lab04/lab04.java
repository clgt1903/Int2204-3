import java.util.Scanner;

public class lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("nhap cac phan tu cua mang");
        for (int i= 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sosanh(3,4));
        System.out.println(sosanhArray(arr));
    }
    public static int sosanh(int num1 , int num2){
        return (num1>num2 ? num1 : num2);
    }
    public static int sosanhArray(int[] arr) {
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    public static String BMI(double weight, double hight){
        double bmi= 0.00;
        bmi= weight/ (hight*hight);
        if (bmi<18.5)
           return "thieu can";
        else if (bmi>18.5 && bmi<=22.99)
            return "binh thuong";
        else if (bmi >=23 && bmi <=25.99)
            return "thua can";
        else 
            return "beo phi";
    }
    
}
