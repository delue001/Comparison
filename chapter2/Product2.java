package chapter2;

import java.util.Scanner;
public class Product2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.println("b * c = a");
        //a program performs a simple payroll calculation.

        //2.10

        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x); //a
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x)); //b
        System.out.print("x = "); //c
        System.out.printf("%d = %d%n", (x + y), (y + x)); //d

        //Exercise 2.11  (a)
        //Exercise2.12 (a), (e)
        //Exercise2.13 (15). (3),(324)
            //Exercise2.14
        System.out.println("1 2 3 4");

        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");

        System.out.printf("%s %s %s %s", 1, 2, 3, "4\n");

        //2.15 Exercise
        int a;
        int b;
        int sum;
        int product;
        int difference;
        int division;

        System.out.print("First integer");
        a = input.nextInt();

        System.out.print("Second integer");
        b = input.nextInt();

        sum = a + b;
        System.out.printf("sum is %d%n", sum);

        product = a * b;
        System.out.printf("product is %d%n", product);

        difference = a - b;
        System.out.printf("difference is %d%n", difference);

        division = a / b;
        System.out.printf("division %d%n", division);  //Simple Arithmetic

        int num1;
        int num2;
        int larger;

        System.out.print("Enter first integer");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer");
        num2 = input.nextInt();


        larger = num2;

        if (num1 > larger)
            larger = num1;
        System.out.printf("is larger %d%n", larger);

        if(num1 == num2)
            System.out.println("These number are equal"); //Comparing integer

    }
}
