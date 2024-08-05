package Chapter5;

import java.util.Scanner;
public class BarChart {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
                int num;
                num = 1-30;
                for (int i = 0; i < 5; i++)
                {
                    System.out.println("Enter a number between 1 - 30: ");
                    num = input.nextInt();
                }
                for (int j = 0; j < num; j++)
                {
                    System.out.print("*");
                }
                System.out.println();

    }
}
