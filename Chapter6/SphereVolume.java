package Chapter6;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter double radius of sphere :");
        double radius = input.nextDouble();
        System.out.printf("Volume of sphere is: %f%n",sphereVolume(radius));

    }
    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
