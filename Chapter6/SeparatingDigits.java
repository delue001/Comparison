package Chapter6;

public class SeparatingDigits {
    public static void main(String []a){
        int number = 6789;
        displayDigits(number);
    }
    public static int quotient(int a, int b){
        return a / b;
    }
    public static int reminder(int a, int b){
        return a % b;
    }
    public static void displayDigits(int number){
        if (number < 1  || number > 99999)
        {
            System.out.println("Number out of range, please enter a number btw 1 and 99999");
            return;
        }
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + reminder(number, 10);
            number =quotient(number, 10);
        }
        while (reverseNumber>0){
            System.out.print(reminder(reverseNumber,10));
            if ((reverseNumber = quotient(reverseNumber, 10)) > 0)
                System.out.print(" ");
        }
    }
}
