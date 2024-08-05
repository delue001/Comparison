package Chapter6;
    import java.util.Random;
public class RandomNumber {
    public static void main(String [] args) {
        Random a = new Random();
        int n = a.nextInt(2);
        n+=1;
        System.out.printf("Random A is: %d%n",n);

    }
}
