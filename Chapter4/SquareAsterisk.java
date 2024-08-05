package Chapter4;

import java.util.Scanner;
public class SquareAsterisk {
    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of the square");
        int length=myObj.nextInt();
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(i==0||i==(length-1)||j==0||j==(length-1))
                    System.out.print(" * ");
                else
                    System.out.print("    ");
            }
            System.out.print("\n");
        }
    }
}
