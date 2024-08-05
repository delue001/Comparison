package Chapter6;

import java.util.Scanner;

public class QualityPoints {
    public static void main(String []a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student average");
        int studentAverage = input.nextInt();
        System.out.println(qualityPoint(studentAverage));
    }
    public static int qualityPoint(int average){
        if (average >= 90 && average <= 100){
            return 4;
        }
        else if (average >=80 && average <90){
            return 3;
        }
        else if (average >= 70 && average < 80){
            return 2;
        }
        else if (average >= 60 && average < 70){
            return 1;
        }
        else
            return 0;
    }
}
