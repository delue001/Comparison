package Chapter4;

import java.util.Scanner;
public class Mileage {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallon;
        int trip = 1;

        while (trip <= 3) {
            trip++;
            System.out.println("Enter Miles: ");
            miles = input.nextInt();
            System.out.println("Enter Gallon: ");
            gallon = input.nextInt();

            double EachTrip = miles * gallon;

            System.out.printf("Each trip is: %s%n", EachTrip);
        }
    }
}
