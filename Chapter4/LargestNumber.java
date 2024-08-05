package Chapter4;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter = 1;
        int largest = 0;
        int secondLargest =0;
        int thirdLargest = 0;

        while (counter <= 10)
        {
            counter++;
            System.out.println("Enter 10 integer:");
            number = input.nextInt();

            /*if (largest < number) {
                secondLargest = largest;
                largest = number;*/

            if ( number > largest ) {
                secondLargest = largest;
                largest = number;
            }

            if (largest > number) {
                if (number > secondLargest)
                    secondLargest = number;
            }
        }
        System.out.printf("Largest number is: %d%nSecond Largest number is: %d%n", largest, secondLargest);
    }
}
