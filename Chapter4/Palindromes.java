package Chapter4;

import java.awt.*;
import java.util.Scanner;
public class Palindromes {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int palindromes;

        System.out.println("Enter five digit integers");
        palindromes = input.nextInt();

        if (palindromes >= 5)
        {
            palindromes = 5;
            System.out.print("Its a palindromes");

            if (palindromes < 5)
                System.out.println("Error message");
                System.out.println("Enter a new 5 digit integers");
        }

    }
}
