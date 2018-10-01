/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Toàn Tồi Tệ
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public void gcDivisor(int a,int b){// Tính ước chung lớn nhất
        if(a<0)
            a=0-a;
        if(b<0)
            b=0-b;
        if(a==0||b==0)
        {
            System.out.println(a+b);
            return ;
        }else while(a!=b)
        {
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        System.out.println(a);
             
    }
    public int Fibonacci(int n){//ham tim so fibonacci
           if(n==0){
               return 0;
           }
               
           if(n==1){
               return 1;
           }
               
           if(n>1){
               return Fibonacci(n-1)+Fibonacci(n-2);
           }
           return 1;
               
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        Lab3 lab3 = new Lab3();
        lab3.gcDivisor(4,2);//uoc chung lon nhat         
        System.out.println(lab3.Fibonacci(10));
        Fraction Fr1 = new Fraction(3, 3);
        Fraction Fr2 = new Fraction(-5, 3);//khoi tao 2 phan so
        System.out.println(Fr1.equals(Fr2));
        Fr1.Plus(Fr2);//cong
        Fr1.Share(Fr2);//chia
        Fr1.Minus(Fr2);//tru
        Fr1.Human(Fr2);//nhan
    }  
}
