package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{WON, CONTINUE, LOST, NEW}

    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1,die2,sum);
        return sum;
    }
    public static int wagerPlacement(int bankBalance){
        Scanner input = new Scanner(System.in);
        System.out.println("enter wager");
        int wager = input.nextInt();

        if (!(wager <= bankBalance)){
            System.out.println("Re-enter wager");
            wager = input.nextInt();
        }
        return wager;
    }
    public static void main(String[] args){
        int myPoint = 0;
        Status gameStatus = Status.NEW;
        int sumOfDice = rollDice();
        int bankBalance = 1000;
        int wager = wagerPlacement(bankBalance);

        if (gameStatus == Status.NEW){
            if (sumOfDice == 7 || sumOfDice == 11){
                gameStatus = Status.WON;
            } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
                gameStatus = Status.LOST;
            }
            gameStatus = Status.CONTINUE;
        }else {
            myPoint = sumOfDice;
            System.out.printf("Point is %d%n", myPoint);
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if (sumOfDice == myPoint){
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }
        if (gameStatus == Status.WON){
            System.out.println("Player Wins");
            bankBalance += wager;
        }else {
            System.out.println("Player Loss");
            bankBalance -=wager;
        }
        System.out.printf("%d%n",bankBalance);
        chatter();

        if (bankBalance == 0){
            System.out.println("Sorry, You busted!");
        }
    }
    public static void chatter(){
        String[] chatter = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!","You're up big. " +
                "Now's the time to cash in your chip!"};
        SecureRandom random = new SecureRandom();
        int j = random.nextInt(3);
        System.out.println(chatter[j]);
    }
}
