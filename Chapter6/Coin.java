package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    public enum CoinFace{HEADS, TAILS}
    public static CoinFace flip(){
        Random random = new Random();
        return CoinFace.values()[random.nextInt(CoinFace.values().length)];
    }
    public static void main(String[] args){
        int head = 0;
        int tail = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Press any number to toss coin or -1 to end");
        int selection = input.nextInt();
        while (selection != 1)
        {
            flip();

            if (flip()==CoinFace.HEADS){
                head++;
            }
            else
                tail++;
            System.out.println("Press any number to toss coin or -1 to end");
            selection = input.nextInt();
        }
        System.out.printf("%s%d%s%n", "Head shows up ", head, " times");
        System.out.printf("%s%d%s%n", "Tail shows up ", tail, " times");
    }
}
