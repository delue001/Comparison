package Chapter5;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String []args) {
        int value=2;
        int no1;
        int no2;
        int no3;
        int no4;
        int smallest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter several integers: ");
        //while (input.hasNext()) {
         no1 = input.nextInt();
         System.out.println("Enter next integers:");
         no2 = input.nextInt();
        System.out.println("Enter next integers:");
         no3 = input.nextInt();
        System.out.println("Enter next integers:");
        no4 = input.nextInt();

        smallest=no1;
            if (no2 < smallest)
                smallest=no2;
            if (no3<smallest)
                smallest=no3;
            if (no4<smallest)
                smallest=no4;
        System.out.printf("Smallest Value is :%d%n", smallest);
    }
}
