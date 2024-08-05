package Chapter7;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args){
        int[][] sales = new int[5][4];
        Scanner input = new Scanner(System.in);

        int i;
        for (i = 0;  i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Enter sales for product "+ (i+1) +" by salesperson "+ (j+1) +"; ");
                sales[i][j] = input.nextInt();
            }
        }
        System.out.println("Sales Data: ");
        for (i = 0; i < 5; i++){
            for (int j = 0; j<4; j++){
                System.out.print(sales[i][j] +"\t");
            }
            System.out.println();
        }
        for (i = 0; i < 5; i++){
            int total = 0;
            for (int j = 0; j<4; j++){
                total += sales[i][j];
            }
            System.out.println("Total sales for product "+(i + 1)+total);
        }
        for (int j = 0; j<4; j++){
            int total = 0;
            for (i = 0; i < 5; i++){
                total += sales[i][j];
            }
            System.out.println("Total sales by salesperson "+(j+1)+total);
        }
    }
}
