package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerInstructionFatigue {
    private static final SecureRandom random = new SecureRandom();
    private static int firstValue;
    private static int secondValue;
    private static int studentAnswer;
    private static int correctAnswer;

    public static void main(String []args){
        getFirstValue();
        getSecondValue();
        question();
        multiplication();
        getStudentAnswer();
        checkAnswer();

        while (!(studentAnswer == correctAnswer))
        {
            getStudentAnswer();
            checkAnswer();
        }

    }
    public static int getFirstValue(){
        return firstValue = 1 + random.nextInt(5);
    }
    public static int getSecondValue(){
        return secondValue = 1 + random.nextInt(5);
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
