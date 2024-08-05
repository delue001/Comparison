package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModification {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int randomNumber = 1 + random.nextInt(1000);
        System.out.println("Enter guess number");
        int guess = input.nextInt();

        int count=0;

        while (guess != randomNumber)
        {
            if (guess >= randomNumber){
                System.out.println("Too high. Try again");
            }
            else if (guess <= randomNumber){
                System.out.println("Too low. Try again");
            }
            System.out.println("Enter guess integer number BTW 1 and 1000");
            guess = input.nextInt();

            count++;
        }
        if (guess == randomNumber) {
            System.out.println("Congratulations. You guessed the number!");
        }
        if (count < 10 && guess == randomNumber){
            System.out.println("You know the secret or You got lucky");
        }
        else if (count == 10 && guess == randomNumber) {
            System.out.println("Aha! You know the secret");
        }
        else if (count > 10 && guess == randomNumber){
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses");
        }

    }
}
