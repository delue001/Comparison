package Chapter7;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of fib: ");
        int fib = input.nextInt();
        System.out.println("The " + fib + "th fibonacci number is: " + fibonacci(fib));
    }
    public static double fibonacci(int fib){
        if (fib <= 1)
            return fib;
        else
            return fibonacci(fib - 1) + fibonacci(fib - 2);
    }
}
