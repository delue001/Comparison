package Chapter4;

import java.util.Scanner;
public class SalesCommission {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int item;
        double value;
        int weeklyEarnings;

        System.out.println("Enter item sold:");
        item = input.nextInt();
        System.out.println("Enter value:");
        value = input.nextDouble();
        System.out.println("Weekly Receives: ");
        weeklyEarnings = input.nextInt();

        double earnings = value * 9 / 100 + weeklyEarnings;
        System.out.printf("Earnings %s%n", earnings);


    }
}
