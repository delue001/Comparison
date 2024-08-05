package Chapter7;

import java.util.Scanner;

public class AirlineReservationSystem2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        boolean[] seats = new boolean[10];
        System.out.println("Please type 1 for First Class or 2 for Economy: ");
        int option = scanner.nextInt();

        if (option == 1){
            assignFirstClassSeat(seats);
        }
        else if (option == 2) {
            assignEconomySeats(seats);
        }
        else{
            System.out.println("Invalid Option, Please try again.");
        }
    }
    private static void assignFirstClassSeat(boolean[] seats){
        for (int i =0; i<5; i++){
            if (!seats[i]){
                seats[i] = true;
                System.out.println("You've been assigned seat "+(i+1) +" In First Class");
                return;
            }
        }
        System.out.println("First Class is full, Would you like to be placed in Economy?(Y/N)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("Y")){
            assignEconomySeats(seats);
        }else{
            System.out.println("Next flight leaves in 3 hours");
        }
    }
    private static void  assignEconomySeats(boolean[] seats) {
        for (int i = 5; i < 10; i++){
            if (!seats[i]){
                seats[i] = true;
                System.out.println("You've been assigned seat " +(i + 1)+" In Economy");
                return;
            }
        }
        System.out.println("Economy is full. Would you like to be place in First Class(Y/N)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("Y")) {
            assignFirstClassSeat(seats);
        }else {
            System.out.println("Next flight leaves in 3 hours");
        }
    }
}
