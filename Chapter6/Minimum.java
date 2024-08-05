package Chapter6;

import java.util.Scanner;

public class Minimum {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first values");
        double no1 = input.nextDouble();
        System.out.println("Enter second values");
        double no2 = input.nextDouble();
        System.out.println("Enter third values");
        double no3 = input.nextDouble();

        double smallest = minimum3(no1, no2, no3);
        System.out.println("The smallest number is: "+smallest);


    }
    public static double minimum3(double a, double b, double c) {
        return Math.min(a,Math.min(b,c));

    }
}
