package chapter2;//program will calculate the product of three integers.
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        int result;

        System.out.print("Enter The First Integer");
        x = input.nextInt();

        System.out.print("Enter The second Integer");
        y = input.nextInt();

        System.out.print("Enter The Third integer");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("product is %d%n", result);


        // Exercise 2.17 some mathematical error needed fixing.
        int numb2;
        int numb3;
        int numb4;
        int sum;
        int product;
        int average;
        int smallest;
        int largest;

        System.out.print("First integer");
        numb2 = input.nextInt();

        System.out.print("Second integer");
        numb3 = input.nextInt();

        System.out.print("Third integer");
        numb4 = input.nextInt();

        sum = numb2 + numb3 + numb4;
        System.out.printf("the sum is %d%n", sum);

        product = numb2 * numb3 * numb4;
        System.out.printf("the product is %d%n", product);

        average = numb2 + numb3 + numb4 / 3;
        System.out.printf("The average is %d%n", average);

        smallest = numb2;
        largest = numb2;

        if (numb4 < smallest)
            smallest = numb4;
        if (numb3 < smallest)
            smallest = numb3;
        System.out.printf("The smallest number is %d%n", smallest);

        if (numb3 > largest)
            largest = numb3;
        if (numb4 > largest)
            largest = numb4;
        System.out.printf("The largest number is %d%n", largest);
    }
}
