package Chapter7;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){
        int amount200_299 = 0;
        int amount300_399 = 0;
        int amount400_499 = 0;
        int amount500_599 = 0;
        int amount600_699 = 0;
        int amount700_799 = 0;
        int amount800_899 = 0;
        int amount900_999 = 0;
        int amount1000_over = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of salespeople");
        int numSalespeople = input.nextInt();

        for (int i = 0; i<numSalespeople; i++)
            System.out.println("Enter gross sales for sales"+ (i + 1)+"; ");
        double grossSales = input.nextDouble();

        double salary = 200 + 0.9 * grossSales;
        int salaryInt = (int) salary;

        if (salaryInt >= 200 && salaryInt <= 299){
            amount200_299++;
        }
        else if (salaryInt >= 300 && salaryInt <= 399) {
            amount300_399++;
        }
        else if (salaryInt >= 400 && salaryInt <=499) {
            amount400_499++;
        }
        else if (salaryInt >= 500 && salaryInt<= 599){
            amount500_599++;
        }
        else if (salaryInt>=600 && salaryInt <=699){
            amount600_699++;
        }
        else if (salaryInt >= 700 && salaryInt<=799){
            amount700_799++;
        }
        else if (salaryInt>=800 && salaryInt<=899){
            amount800_899++;
        }
        else if (salaryInt >= 900 && salaryInt<=999){
            amount900_999++;
        }
        else
            amount1000_over++;

        System.out.println("Salary Range\tCount");
        System.out.println("-------------\t-----");


        System.out.println("$200_299\t\t" + amount200_299);
        System.out.println("$300_399\t\t" + amount300_399);
        System.out.println("$400_499\t\t" + amount400_499);
        System.out.println("$500_599\t\t" + amount500_599);
        System.out.println("$600_699\t\t" + amount600_699);
        System.out.println("$700_799\t\t" + amount700_799);
        System.out.println("$800_899\t\t" + amount800_899);
        System.out.println("$900_999\t\t" + amount900_999);
        System.out.println("$1000_over\t\t" + amount1000_over);




    }
}
