package Chapter6;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total numbers to run: ");
        int totalNumber = input.nextInt();
        for (int i = 0; i<totalNumber;i++)
        {
            System.out.println("Enter integers");
            int numbers = input.nextInt();
            System.out.println(even(numbers));
        }

    }
    public static boolean even(int Even){
        if (Even % 2 == 0)
            return true;
        else
            return false;
    }
}
