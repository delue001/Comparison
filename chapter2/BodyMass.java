package chapter2;

import java.util.Scanner;
public class BodyMass {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        float weight;
        float height;
        float BMI;

        System.out.print("Enter weight value in kg: ");
        weight = input.nextFloat();

        System.out.print("Enter height in meters: ");
        height = input.nextFloat();

        BMI = weight / (height * height); // parentheses is important

        System.out.printf("BMI = %s%n", BMI);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");




    }
}
