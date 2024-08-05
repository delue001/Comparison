package Chapter7;

import java.util.Scanner;

public class AirlineReservationSystem {
    static boolean[] seats = new boolean[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please enter 1 for First Class or Enter 2 for Economy");
        int userInput = input.nextInt();
        if (userInput == 1){
            assignFirstClassSeat();
        } else if (userInput == 2) {
            assignEconomyClassSeat();
        }
        else {
            System.out.println("Invalid Input. Try again.");
        }
       if (seats[1] && seats[2] && seats[3] && seats[4] && seats[5]){
            firstClassPlacement();
        }
        if (seats[6] && seats[7] && seats[8] && seats[9] && seats[10]){
            economyClassPlacement();
        }

    }
    public static void assignFirstClassSeat(){
        for (int seatNumber = 0; seatNumber <= 5; seatNumber++){
            if (!seats[seatNumber]){
                System.out.println("Your seat number is " +(seatNumber + 1)+"\nFirst class");
                seats[seatNumber] = true;
                return;
            }
        }
    }
    public static void assignEconomyClassSeat(){
        for (int seatNumber = 5; seatNumber<=10; seatNumber++){
            if (!seats[seatNumber]){
                System.out.println("your seat number is "+(seatNumber+1)+ "\nEconomy");
                seats[seatNumber] = true;
                return;
            }
        }
    }
    public static void firstClassPlacement(){
        System.out.println("Do you mind being placed in the economy seat?");
        System.out.println("Enter 1 for Yes"+ "\n2 for No");

        int userOption = input.nextInt();
        if (userOption == 1)
            System.out.println("Next flight leaves in 3hrs");
        else if (userOption == 2) {
            assignEconomyClassSeat();
        }
        else {
            System.out.println("Invalid Option");
        }
    }
    public static void economyClassPlacement(){
        System.out.println("Do you mind being placed in the first class seat?");
        System.out.println("Enter 1 for Yes" + "\n 2 for No");

        int userOption = input.nextInt();
        if (userOption == 1){
            System.out.println("next flight leaves in 3hrs");
        } else if (userOption == 2) {
            assignFirstClassSeat();
        }
        else {
            System.out.println("Invalid Option");
        }
    }

}
