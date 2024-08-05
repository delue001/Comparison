package Chapter5;

import java.util.Scanner;

public class OnlineSales {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Product prices: product 1: $2.98, product 2: $4.50, product 3: $9.98, product 4: $4.49, product 5: $6.87");

        int productNumber;
        double quantitySold;


        while (true)
        {
            System.out.println("Enter product number (1-5) and quantity sold (0r 0 to stop)");
            productNumber = input.nextInt();
            if (productNumber==0)
            {
                break;
            }
            System.out.print("Input Quantity sold:");
            quantitySold = input.nextInt();

                switch (productNumber) {
                    case 1:
                        quantitySold = 2.98;
                        break;
                    case 2:
                        quantitySold = 4.50;
                        break;
                    case 3:
                        quantitySold = 9.98;
                        break;
                    case 4:
                        quantitySold = 4.49;
                        break;
                    case 5:
                        quantitySold = 6.87;
                        break;
                    default:
                        break;
                }
                System.out.println("Total Price = $"+productNumber * quantitySold);

        }

    }
}
