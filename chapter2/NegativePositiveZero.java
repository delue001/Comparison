package chapter2;

import java.util.Scanner;
public class NegativePositiveZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int positive;
        int negative;
        int zero;

        System.out.print("Input first number");
        number1 = input.nextInt();

        System.out.print("Input second number");
        number2 = input.nextInt();

        System.out.print("Input third number");
        number3 = input.nextInt();

        System.out.print("Input fourth number");
        number4 = input.nextInt();

        System.out.print("Input fifth number");
        number5 = input.nextInt();

        positive = 1;
        negative = -1;
        zero = 0;

        if (number1 > positive)
            positive = number1;
        if (number2 > positive)
            positive = number2;
        if (number3 > positive)
            positive = number3;
        if (number4 > positive)
            positive = number4;
        if (number5 > positive)
            positive = number5;

        if (number1 < negative)
            negative = number1;
        if (number2 < negative)
            negative = number2;
        if (number3 < negative)
            negative = number3;
        if (number4 < negative)
            negative = number4;
        if (number5 < negative)
            negative = number5;

       /* if (number1 == zero)
            zero = number1;
        if (number2 == zero)
            zero = number2;
        if (number3 == zero)
            zero = number3;
        if (number4 == zero)
            zero = number4;
        if (number5 == zero)
            zero = number5;*/
        System.out.printf("positive number %d%n negative %d%n zero %d%n", positive, negative, zero);

    }
}
