package Chapter6;

import java.util.Scanner;

public class AsterisksSquare {
    public static void main(String [] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value for row and col: ");
        int side = input.nextInt();

        squareOfAsterisks(side);
    }
    public static void squareOfAsterisks(int solid){
        for (int row = 1; row <= solid; row++)
        {
            for (int col = 1; col <= solid; col++)
            {
                System.out.print("x");
            }
            System.out.println();
        }


    }
}
