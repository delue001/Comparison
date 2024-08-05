package chapter3;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){
        Account account1 = new Account("Jane Green",50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1");
        double depositAmount = input.nextDouble();
        System.out.printf("%n Adding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.print("Enter withdraw amount");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%n withdrawing %.2f from account1 balance %n%n", withdrawAmount);
       account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2");
        depositAmount = input.nextDouble();
        System.out.printf("%n%n Adding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Enter withdrawal amount from account2");
        withdrawAmount = input.nextDouble();
        System.out.printf("%n withdrawal %.2f from account2 balance %n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

    }

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
        //System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}
