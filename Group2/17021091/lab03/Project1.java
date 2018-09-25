public class Project1 {
    public int ucln(int a, int b){//tim uoc chung cua hai so a va b
        while(a != 0){
            int t = a;
            a = b%a;
            b = t;
        }
        return b;
    }
    public int fibonaciN(int n){//tim so fibonaci thu n
        int n0 = 0, n1 = 1, n2 = 0;
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                for(int i = 2;i <= n;i ++){
                    n2 = n0 + n1;
                    n0 = n1;
                    n1 = n2;
                }
                return n2;
        }
    }
    public static void main(String[] args) {
        Project1 t = new Project1();
        System.out.printf("%d\n", t.ucln(34, 42));
        System.out.printf("%d\n", t.fibonaciN(10));
    }
    
}
