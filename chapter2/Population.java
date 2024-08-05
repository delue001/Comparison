package chapter2;

import java.util.Scanner;
public class Population {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int currentPopulation;
        int annualPopulation;
        int year1;
        int year2;
        int year3;
        int year4;
        int year5;
        int estimatedPopulation;

        System.out.print("Current chapter2.Population is: ");  // 8.1billion
        currentPopulation = input.nextInt();

        System.out.print("Annual chapter2.Population Growth Rate: ");  //83million
        annualPopulation = input.nextInt();


        estimatedPopulation = currentPopulation + annualPopulation;

        year1 = estimatedPopulation + annualPopulation;
        year2 = estimatedPopulation + (annualPopulation * 2);
        year3 = estimatedPopulation + (annualPopulation * 3);
        year4 = estimatedPopulation + (annualPopulation * 4);
        year5 = estimatedPopulation + (annualPopulation * 5);

        System.out.printf("year 0ne population is %d%n", year1);
        System.out.printf("year two population is: %d%n", year2);
        System.out.printf("year three population is: %d%n", year3);
        System.out.printf("year four population is: %d%n", year4);
        System.out.printf("year five population is: %d%n", year5);


    }
}
