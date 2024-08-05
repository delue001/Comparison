package Chapter6;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Original Number Entered is : ");
        double original = input.nextDouble();
        System.out.printf("Rounded number is %d%n",(int)Math.floor(original+0.5));
    }
}
