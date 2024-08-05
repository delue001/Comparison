package chapter2;

import java.util.Scanner;
public class Multiples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int multiple;

        System.out.print("Enter first integer:");
        number1 = input.nextInt();
        System.out.print("Enter second integer:");
        number2 = input.nextInt();

        multiple = number1 % number2;

        if (number1 == number2)
            System.out.printf("Print result: %d%n", multiple);
        if (number1 != number2)
            System.out.printf("Print result: %d%n", multiple);
    }
}
