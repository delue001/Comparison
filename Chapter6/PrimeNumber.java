package Chapter6;

public class PrimeNumber {
    public static void main(String [] args) {
        for (int i = 2; i<=1000; i++){
            if (isPrime(i)){
                System.out.printf("%d%s%b%n",i," is a prime number ", isPrime(i));
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        for (int i = 2; i<=Math.sqrt(number); i++)
            if (number % i == 0)
                return false;

        return true;
    }


}
