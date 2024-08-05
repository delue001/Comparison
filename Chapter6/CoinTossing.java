package Chapter6;

import java.util.Scanner;

public class CoinTossing {
    public enum Coin{HEADS, TAILS}

    public static Coin flip(){
        return Math.random()<0.5 ? Coin.HEADS: Coin.TAILS;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int headCounts = 0;
        int tailCounts = 0;
        while (true)
        {
            System.out.println("Menu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Show results");
            System.out.println("3. Exit");
            System.out.println("Enter your selection");
            int selection = input.nextInt();
            if (selection ==1)
            {
                Coin result = flip();
                if (result ==Coin.HEADS){
                    headCounts++;
                }
                else
                    tailCounts++;
                System.out.println("Coin Toss Result:"+result);
            }
            else if (selection == 2)
            {
                System.out.println("Heads"+headCounts);
                System.out.println("tails"+tailCounts);
            }
            else if (selection ==3)
            {
                break;
            }
            else
                System.out.println("invalid selection. Try again");

        }
    }
}
