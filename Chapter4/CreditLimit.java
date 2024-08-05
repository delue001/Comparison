package Chapter4;

import java.util.Scanner;
public class CreditLimit {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int acctNum;
        int balanceMB;
        int chargeItem;
        int creditApplied;
        int creditLimit;

        System.out.println("Enter Account Number: ");
        acctNum = input.nextInt();
        System.out.println("Enter balance at beginning of month: ");
        balanceMB = input.nextInt();
        System.out.println("Enter Items charge by customer: ");
        chargeItem = input.nextInt();
        System.out.println("Enter credit applied by customer: ");
        creditApplied = input.nextInt();
        System.out.println("Enter credit limit: ");
        creditLimit = input.nextInt();

        int newBalance = balanceMB + chargeItem - creditApplied;
        System.out.printf("The new balance is: %d%n", newBalance);

        if (creditLimit < newBalance) {
            System.out.println("Credit limit exceeded");
        }
    }
}
