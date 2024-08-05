package Chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to convert celsius to Far OR 2 to convert Far to Cel: ");
        int option = input.nextInt();
        if (option == 1)
        {
            System.out.println("Enter celsius temp");
            int celsius = input.nextInt();
            int fahrenheit = TemperatureConversion.fahrenheit(celsius);
            System.out.printf("The fahrenheit equivalent of %d celsius is %d fahrenheit.%n", celsius, fahrenheit);
        }
        else if (option == 2)
        {
            System.out.println("Enter fahrenheit temp");
            int fahrenheit = input.nextInt();
            int celsius = TemperatureConversion.celsius(fahrenheit);
            System.out.printf("The celsius conversion of %d fahrenheit is %d fahrenheit.%n",fahrenheit,celsius);
        }
        else
            System.out.println("Invalid option. Enter option 1 or 2");


    }
    public static int celsius(int fahrenheit){
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }
    public static int fahrenheit(int celsius){
        return (int) (9.0 / 5.0 * (celsius + 32));
    }
}
