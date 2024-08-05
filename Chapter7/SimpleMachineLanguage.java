package Chapter7;

import java.util.Scanner;

public class SimpleMachineLanguage {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 4;
        while (count <= 10){
            int number = input.nextInt(4);
            if (number <= 0) {
                continue;
            }
            sum += number;
            count++;
        }
        System.out.println("Sum: "+ sum);
    }

}
