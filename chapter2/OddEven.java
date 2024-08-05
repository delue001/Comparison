package chapter2;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        int odd;
        int even;
        System.out.print("Enter an integer");
        number = input.nextInt();

        even = number % 2;
        odd = number % 2;

        if (even == 0)
            System.out.printf("The number is even %d%n", even);
        if (odd != 0)
            System.out.printf("The number is odd %d%n", odd);

    }
}
