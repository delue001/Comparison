package Chapter7;

import java.util.Scanner;

public class Polling {
    public static void main(String[] args){
        String[] topics = {"Racist Chants", "Sexual Abuse", "Looting", "Climate change","Depression"};
        int[][] responses = new int[5][10];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < topics.length; i++){
            System.out.println("Rate the importance of "+topics[i]+
                    " From 1 (least important) to 10 (most important): ");
            int rate = input.nextInt();
            responses[i][rate]++;
        }

        //SUMMARY REPORT
        System.out.println("Summary Report :");
        System.out.print("Topics\t\t");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 0; i < topics.length; i++){
            System.out.print(topics[i] + "\t\t");
            for (int k = 0; k < 10; k++){
                System.out.print(responses[i][k]+"\t");
            }
        }
        int i = 0;
        double average = 0;
        for (int k = 0; k <10; k++){

            average += responses[i][k] * (k+1);
        }
        average /= sum(responses[i]);
        System.out.printf("\t%.2f%n",average);

        int maxPoint = Integer.MAX_VALUE;
        int minPoint = Integer.MIN_VALUE;
        String maxTopic = "";
        String minTopic = "";
        for (i = 0; i < topics.length; i++){
            int points = 0;
            for (int k = 0; k<10; k++){
                points += responses[i][k] * (k+1);
            }
            if (points <= maxPoint){
                maxPoint = points;
                maxTopic = topics[i];
            }
            if (points >= minPoint){
                minPoint = points;
                minTopic = topics[i];
            }
        }
        System.out.println("The issue that received the Lowest point total is "+maxTopic +
                " with " + maxPoint + " points ");
        System.out.println("The issue that received the Highest point total is "+minTopic +
                " with " + minPoint + " points ");

    }
    public static int sum(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }

}
