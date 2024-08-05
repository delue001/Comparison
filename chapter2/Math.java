package chapter2;

import java.util.Scanner;
public class Math {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float Pi = 3.14159f;
        float r;
        float area;
        float diameter;
        float circumference;

        System.out.print("Enter radius of a circle");
        r = input.nextFloat();

        diameter = 2 * r;
        area = Pi * r * r;
        circumference = 2 * Pi * r;

        System.out.printf("diameter is %f%n area is %s%n circumference is %f%n",
                diameter,area, circumference);
    }
}
