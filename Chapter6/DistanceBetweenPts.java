package Chapter6;

import java.util.Scanner;

public class DistanceBetweenPts {
    public static void main(String []a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinate x1");
        double cox1 = input.nextDouble();
        System.out.println("Enter coordinate x2");
        double cox2 = input.nextDouble();
        System.out.println("Enter coordinate y1");
        double coy1 = input.nextDouble();
        System.out.println("Enter coordinate y2");
        double coy2 = input.nextDouble();
        System.out.println(distance(cox1,cox2,coy1,coy2));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }
}
