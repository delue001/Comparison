package Chapter6;

import java.util.Scanner;

public class Exponential {
    public static void main(String [] a) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter integer base number :");
        int base = input.nextInt();
        System.out.print("Enter Exponential int number:");
        int expo = input.nextInt();
        int result = integerPower(base,expo);
        System.out.printf("Base exponent of an integer is :%d%n",result);


    }
    public static int integerPower(int base, int expo){
        int result = 1;
        for (int z =1; z<=expo; z++){
            result = result*base;
        }
        return result;
    }
}
