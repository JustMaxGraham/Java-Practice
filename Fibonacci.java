public class Fibonacci {

    static int fibonacci(int n){

        int[] fib = new int[n + 2];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i ++){
            fib[i] = fib[i-1] + fib[i -2];
        }
        return fib[n];
    }

    public static void main(String[] args){
        System.out.println(fibonacci(5) + ": Should be 5.");
        System.out.println(fibonacci(0) + ": Should be 0.");
        System.out.println(fibonacci(1) + ": Should be 1.");
    }
}
