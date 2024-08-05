package Chapter6;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        int reverseNumber = reverseDigits(number);
        System.out.println("Reverse Number "+reverseNumber);
    }
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0)
        {
            int digits = number % 10;
            reversed = reversed * 10+digits;
            number /=10;
        }
        return reversed;
    }
}
