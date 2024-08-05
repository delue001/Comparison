package chapter2;

import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        int thisIsAVariable;
        int q76354;
        int number;

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int largest;
        int smallest;


        System.out.print("Enter an Integer: ");
        number = input.nextInt();

        System.out.println("This is a Java program");

        System.out.printf("%s%n%s%n", "This is a Java", "program");

        if (number != 7)
            System.out.println("The variable number is not equal to 7");

        System.out.print("Enter first integer:");
        num1 = input.nextInt();

        System.out.print("Enter second integer:");
        num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        System.out.print("Enter fourth integer");
        num4 = input.nextInt();

        System.out.print("Enter fifth integer");
        num5 = input.nextInt();

        largest = num1;
        smallest = num1;

        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest =num3;
        if (num4 > largest)
            largest = num4;
        if (num5 > largest)
            largest = num5;

        if(num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
        if (num4 < smallest)
            smallest = num4;
        if (num5 < smallest)
            smallest = num5;

        System.out.printf("largest integer is %s%n,smallest integer is %d",
                largest, smallest);
        //System.out.printf("smallest integer is %d%n", smallest);
        // Exercise 2.24
    }
}