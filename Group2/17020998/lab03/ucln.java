public class ucln {

    public int get_ucln(int a, int b){
        int k;
        while(b > 0){
            k = a % b;
            a = b;
            b = k;
        }
        return a;
    }
}