public class Fibonacci {
    public static int fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be >= 1");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int nthValue = fib(n);
        System.out.println("The number in position " + n + " of the Fibonacci sequence is " + nthValue + ".");
    }
}
