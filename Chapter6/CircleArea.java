package Chapter6;

import java.util.Scanner;

public class CircleArea {
    public static void main(String [] a) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius:");
        int radius = input.nextInt();
        System.out.print(circleArea(radius));

    }
    public static double circleArea(int radius){

         return Math.PI *radius*radius;
    }
}
