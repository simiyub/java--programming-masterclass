package data;

public class Calculator {
    public static int nSum(int n) {
        int sum = 0;
        for (int i=0; i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i=1;i<=n;i++) {
            fact*=i;
        }
        return fact;
    }

    public static int fibonacci(int n) {
        int fib=0;
        int prevFib=0;
        for (int i=0;i>=n;i++){
            prevFib=fib;
            fib = fib+prevFib;
        }
        return fib;
    }
}
