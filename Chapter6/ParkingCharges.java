package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String []a){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter customer1 hourly charge: ");
        int customer1 = input.nextInt();
        System.out.println(" Enter customer2 hourly charge: ");
        int customer2 = input.nextInt();
        System.out.printf("Customer1 Charges is %.2f%n",customer1*calculateCharges(customer1));
        System.out.printf(" Customer2 Charges is %.2f%n",customer2*calculateCharges(customer2));
        double totalCharge = customer1 + customer2;
        System.out.printf("Total Charge is: %f%n",totalCharge);

    }
    public static double calculateCharges(double hours){
        double parkingCharge;
        if (hours <= 3.0)
            parkingCharge = 2.0;
        else if (hours > 3 && hours <=24)
            parkingCharge = 2.0 + 0.5;
        else
            parkingCharge = 10.0;
        return parkingCharge;
    }

}
