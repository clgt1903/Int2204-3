package lab03;

import java.util.Scanner;
public class bai01 {
    //ham tim uoc chung lon nhat
    public int ucln(int a,int b){

        if(a==b)    return Math.abs(a);
        else if(a>b)    return ucln(Math.abs(a-b),Math.abs(b));
        else    return ucln(Math.abs(a),Math.abs(b-a));
    }
    // ham tim so fibonacci thu n
    public int fibonacci(int n){
        if(n==0)    return 0;
        else if(n==1)   return 1;
        else    return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] agrs){
        bai01 uc = new bai01();
        bai01 fi = new bai01();
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int n;
        n = sc.nextInt();
        System.out.println(uc.ucln(a,b));
        System.out.println(fi.fibonacci(n));
    }

}
