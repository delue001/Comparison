package Chapter4;

import java.util.Scanner;
public class SalaryCal {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String first;
        String second;
        String third;
        int hourlyRate = 16;
        int straightTime = 40;
        int halfHourWorked = 20;
        int hourWorked = straightTime + halfHourWorked;

        int grossPay = hourWorked * hourlyRate;

        System.out.print("First Employee name: ");
        first = input.nextLine();
        System.out.printf("Gross pay %s%n%d%n", first, grossPay);

        System.out.print("Second employee name: ");
        second = input.nextLine();
        System.out.printf("Gross pay %s%n%d%n", second, grossPay);

        System.out.print("Third employee name: ");
        third = input.nextLine();
        System.out.printf("Gross pay %s%n%d%n", third, grossPay);

        //System.out.printf("Gross Pay is: %d%n",grossPay);

        /*System.out.printf("First %s%n",first);
        System.out.printf("Second %s%n",second);
        System.out.printf("third %s%n",third);*/

    }
}
