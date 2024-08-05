package Chapter6;

import java.util.Scanner;

public class NumberRounding {
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            /*while(number != -1){
            System.out.print("Enter double value to be rounded (-1 to exit): ");
            number = input.nextDouble();*/
            System.out.println("Input original value int: ");
            double number = input.nextDouble();

            ToInteger(number);
            roundToTenths(number);
            roundToHundredths(number);
            roundToThousandths(number);
        }
        public static void ToInteger (double number){
            System.out.printf("Rounded value is : %d%n",(int)Math.floor(number+0.5));
        }

        public static void roundToTenths(double number)
        {
            System.out.printf("Rounded value ToTenths: %f%n",Math.floor(number*10+0.5)/10);
        }

        public static void roundToHundredths(double number)
        {
            System.out.printf("Rounded value ToHundredths: %f%n",Math.floor(number * 100 + 0.5)/100);
        }

        public static void roundToThousandths(double number)
        {
            System.out.printf("Rounded value ToThousandths: %f%n",Math.floor(number * 1000 + 0.5)/1000);
        }
}
