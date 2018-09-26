package lab3;

public class UCLN {
    public static void main(String[] args) {
        int a = 10, b = 13, n = 10;
        UCLN s = new UCLN();
        int c = s.UCLNN(a, b);

        System.out.println("Ước chung lớn nhất: " + c);
        System.out.println("------------");
        System.out.println("Dãy Fibonacci: ");
        for(int i = 0; i < n; i++){
            System.out.print(s.Fibonacci(i) + " ");
        }
    }

    //Tìm ước số chung lớn nhất
    public int UCLNN(int a, int b)
    {
        if(b == 0) return a; //Trường hợp suy biến
        else return UCLNN(b, a%b); //Trường hợp tổng quát
    }


    //Tìm dãy Fibonacci
    public int Fibonacci(int i)
    {
        if(i == 0) return 0;
        if(i == 1) return 1;
        return Fibonacci(i-1) + Fibonacci(i - 2);
    }
}
