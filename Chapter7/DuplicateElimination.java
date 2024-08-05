package Chapter7;

import java.util.Scanner;

public class DuplicateElimination {
    public static void DisplayUniqueValue(int[] array){
        for (int element : array)
            System.out.println("Unique Value is " + element);
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        int fourthInteger;
        int fifthInteger;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 10 and 100 inclusive");
        firstInteger = input.nextInt();
        if (firstInteger >= 10 && firstInteger <= 100 )
            array[0] = firstInteger;
        DuplicateElimination.DisplayUniqueValue(array);

        System.out.println("Enter number BTW 10 and 100 inclusive");
        secondInteger = input.nextInt();
        if (secondInteger >= 10 && secondInteger<=100 && secondInteger!=firstInteger) {
            array[1] = secondInteger;
            DuplicateElimination.DisplayUniqueValue(array);
        }

        System.out.println("Enter number BTW 10 and 100 inclusive");
        thirdInteger = input.nextInt();
        if (thirdInteger >=10 && thirdInteger<=100 && thirdInteger!=firstInteger && thirdInteger!=secondInteger){
            array[2] = thirdInteger;
            DuplicateElimination.DisplayUniqueValue(array);
        }

        System.out.println("Enter number BTW 10 and 100 inclusive");
        fourthInteger = input.nextInt();
        if (fourthInteger>=10&&fourthInteger<=100&&fourthInteger!=firstInteger&&fourthInteger!=secondInteger&&fourthInteger!=thirdInteger){
            array[3] = fourthInteger;
            DuplicateElimination.DisplayUniqueValue(array);
        }

        System.out.println("Enter number BTW 10 and 100 inclusive");
        fifthInteger = input.nextInt();
        if (fifthInteger>=10&&fifthInteger<=100&&fifthInteger!=firstInteger&& fifthInteger!=secondInteger&&
                fifthInteger!=thirdInteger&& fifthInteger!=fourthInteger){
            array[4] = fifthInteger;
        }
        DuplicateElimination.DisplayUniqueValue(array);
    }
}
