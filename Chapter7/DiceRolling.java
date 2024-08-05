package Chapter7;

import java.util.Random;

public class DiceRolling {
    static int[] dieSum = new int[13];
    public static int dieRolling(){
        Random random = new Random();

        int roll1 = 1 + random.nextInt(6);
        int roll2 = 1 + random.nextInt(6);
        return roll1 + roll2;
    }
    public static void rollTimes(){
        for (int i = 0; i< 36000000; i++)
            dieSum[dieRolling()]++;
    }
    public static void main(String[] args){
        rollTimes();
        System.out.println("Sum of rolls  Appearance");
        for (int counter = 2; counter< dieSum.length; counter++)
            System.out.printf("  %02d          %d%n",counter,dieSum[counter]);
    }
}
