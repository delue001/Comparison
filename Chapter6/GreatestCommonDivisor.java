package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String []a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int number2 = input.nextInt();
        System.out.println(gcd(number1,number2));

    }
    public static int gcd(int firstNumber, int secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0)
        {
            if (firstNumber == 0){
                return secondNumber;
            }
            else if (secondNumber == 0){
                return firstNumber;
            }
            else
                return gcd(secondNumber,firstNumber % secondNumber);
        }
        return 0;
    }
}
