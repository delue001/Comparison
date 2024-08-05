package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerInstruction {
    private static final SecureRandom random = new SecureRandom();
    private static int firstValue;
    private static int secondValue;
    private static int studentAnswer;
    private static int correctAnswer;
    public static void main(String [] args) {
        firstValue();
        getSecondValue();
        question();
        multiplication();
        studentAnswer();
        checkAnswer();

        while (!(studentAnswer == correctAnswer)){
            studentAnswer();
            checkAnswer();
        }
        while (studentAnswer == correctAnswer){
            firstValue();
            getSecondValue();
            question();          // [Repeated question when ans correctly]
            multiplication();
            studentAnswer();
            checkAnswer();
        }



    }
    public static int firstValue(){
        return firstValue = 1 + random.nextInt(8);
    }
    public static int getSecondValue(){
        return secondValue = 1 + random.nextInt(9);
    }
    public static void question(){
        System.out.println("How much is " +firstValue+  " times " +secondValue+ " ? ");
    }
    public static int multiplication(){
        return correctAnswer = firstValue * secondValue;
    }
    public static int studentAnswer(){
        Scanner input = new Scanner(System.in);
        return studentAnswer = input.nextInt();
    }
    public static void checkAnswer(){
        if (studentAnswer == correctAnswer)
        {
            System.out.println("Very good");
        }
        else
            System.out.println("No. Please try again");
    }
}
