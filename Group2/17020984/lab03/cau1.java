public class cau1{
    public static void main(String[] args){
        cau1 test = new cau1();
        
        System.out.println(test.UCLN(20,6));

        System.out.println( test.fibo(3));
    }

    public int UCLN(int a, int b){
        if(a<0){
            a=-a;
        }
        if(b<0){
            b=-b;
        }
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }

    public int fibo(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}