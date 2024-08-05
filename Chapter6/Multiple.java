package Chapter6;

import java.util.Scanner;

public class Multiple {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of pairs you want to check");
        int numberOfPairs = input.nextInt();
        for (int i =0; i<numberOfPairs;i++)
        {
            System.out.println("Enter first integer");
            int first = input.nextInt();
            System.out.println("Enter second integer");
            int second = input.nextInt();
            System.out.println(isMultiple(first,second));
        }

        System.out.println(isMultiple(4,8));
    }
    public static boolean isMultiple(int first, int second) {
        if (second % first == 0)
            return true;
        else
            return false;
        //return second % first ==0;
    }

}
