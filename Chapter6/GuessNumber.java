package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int randomNumber = 1 + random.nextInt(1, 1000);
        System.out.println("Enter guess integer number BTW 1 and 1000");
        int guess = input.nextInt();
        while (guess != randomNumber){
            if (guess >= randomNumber){
                System.out.println("Too high. Try again");
            }
            else if (guess <= randomNumber){
                System.out.println("Too low. Try again");
            }
            System.out.println("Enter guess integer number BTW 1 and 1000");
            guess = input.nextInt();
        }
        if (guess == randomNumber){
            System.out.println("Congratulations. You guessed the number!");
        }
    }
}
