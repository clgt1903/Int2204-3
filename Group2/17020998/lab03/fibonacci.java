public class fibonacci {

    public int fibonacci_of_n(int n){
        if (n == 1 || n == 0){
            return 1;
        } else {
            return fibonacci_of_n(n-1) + fibonacci_of_n(n-2);
        }
    }
}