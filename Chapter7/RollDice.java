package Chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class RollDice {
    public static void main(String [] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 1; roll <= 6000000; roll++)
            ++frequency[1 + random.nextInt(6)];

        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%3d%10d%n",face, frequency[face]);
    }

}
