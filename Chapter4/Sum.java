package Chapter4;

public class Sum {
    public static void main(String [] args) {
        int sum = 0;
        int x = 1;

        while (x<= 10) {
            sum = x + sum;
            ++x;
        }
        System.out.printf("The sum is: %d%n", sum);

    }
}
