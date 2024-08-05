package Chapter6;

import java.util.Scanner;

public class CharacterSquare {
    public static void main(String [] a) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        int side = input.nextInt();
        System.out.print("Enter fill character: ");
        char fill = input.next().charAt(0);

        squareOfAsterisks(side,fill);
    }
    public static void squareOfAsterisks(int side, char fill){
        for (int row = 1; row <= side; row++)
        {
            for (int col = 1; col <= side; col++)
            {
                System.out.print(fill);
            }
            System.out.println();
        }


    }
}
