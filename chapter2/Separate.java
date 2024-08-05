package chapter2;

import java.util.Scanner;
public class Separate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;

        System.out.print("input 5 digits: ");
        number1 = input.nextInt();

        digit1 = number1 / 2 % 2;
        digit2 = number1 / 2 % 2;
        digit3 = number1 / 2 % 2;
        digit4 = number1 / 2 % 2;
        digit5 = number1 / 2 % 2;

        if (digit5 > number1)
            System.out.println("You have entered a number more than five digits");
        if (digit4 <= number1)
            System.out.println("You have entered a number less than five digits");

        System.out.printf("%d  %d  %d  %d  %d", digit1, digit2, digit3, digit4, digit5);
    }
}
