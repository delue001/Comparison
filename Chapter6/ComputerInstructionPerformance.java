package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerInstructionPerformance {
    private static final SecureRandom random = new SecureRandom();
    private static int firstValue;
    private static int secondValue;

    private static int studentAnswer;
    private static int correctAnswer;

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for one digit");
        System.out.println("Enter 2 for two digit");
        System.out.println("Enter 1 for three digit");
        int difficult = input.nextInt();

        int percentageAns = 0;
        if (difficult >=1 && difficult <= 3) {
            for (int i = 1; i <= 10; i++) {
                getFirstValue(difficult);
                getSecondValue(difficult);
                question();
                multiplication();
                getStudentAnswer();
                checkAnswer();
            }
            while (!(studentAnswer == correctAnswer)) {
                getStudentAnswer();
                checkAnswer();
                percentageAns -= 10;
            }
            while (studentAnswer == correctAnswer) {
                getFirstValue(difficult);
                getSecondValue(difficult);
                question();
                multiplication();
                getStudentAnswer();
                checkAnswer();
                percentageAns += 10;
            }
            if (percentageAns < 75) {
                System.out.println("Please ask your teacher for extra help");
            } else
                System.out.println("Congratulations, you are ready to goto the next level!");
        }
    }
    public static int getFirstValue(int promptUser){
        if (promptUser == 1) {
            return firstValue = 1 + random.nextInt(5);
        }
        else if (promptUser ==2){
            return firstValue = 1 + random.nextInt(55);
        }
        else
            return firstValue = 1 + random.nextInt(555);
    }
    public static int getSecondValue(int promptUser){
        if (promptUser == 1) {
            return secondValue = 1 + random.nextInt(5);
        }
        else if (promptUser == 2){
            return secondValue = 1 + random.nextInt(55);
        }
        else
            return secondValue = 1 + random.nextInt(555);
    }
    public static void question(){
        System.out.println("How much is "+firstValue+ " Times "+ secondValue+" ? ");
    }
    public static int multiplication(){
        return correctAnswer = firstValue * secondValue;
    }
    public static int getStudentAnswer(){
        Scanner input = new Scanner(System.in);
        studentAnswer = input.nextInt();
        return studentAnswer;
    }
    public static void checkAnswer(){
        if (studentAnswer == correctAnswer){
            goodResponse();
        }
        else
            badResponse();
    }
    public static void goodResponse(){
        int goodResponse = 1 + random.nextInt(4);
        switch (goodResponse)
        {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
        }
    }
    public static void badResponse(){
        int badResponse = 1 + random.nextInt(4);
        switch (badResponse)
        {
            case 1:
                System.out.println("No. Please try again");
                break;
            case 2:
                System.out.println("Wrong. Try once more");
                break;
            case 3:
                System.out.println("Don't give up");
                break;
            case 4:
                System.out.println("No. keep trying");
                break;
        }
    }
}
