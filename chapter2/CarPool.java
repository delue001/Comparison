package chapter2;

import java.util.Scanner;
public class CarPool {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int daily_drive_cost;
        int total_miles;
        int gasoline_cost;
        int average_miles;
        int daily_parking_fees;
        int tolls;

        System.out.print("Input total miles driven per day: ");
        total_miles = input.nextInt();
        System.out.print("Input Cost per gallon of gasoline: ");
        gasoline_cost = input.nextInt();
        System.out.print("input Average miles per gallon: ");
        average_miles = input.nextInt();
        System.out.print("Input daily parking fees: ");
        daily_parking_fees = input.nextInt();
        System.out.print("input tolls per day: ");
        tolls = input.nextInt();

        daily_drive_cost = (total_miles / average_miles)
                * gasoline_cost + daily_parking_fees + tolls;

        System.out.printf("Daily driving cost = %d%n", daily_drive_cost);
    }
}
