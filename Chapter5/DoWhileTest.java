package Chapter5;

public class DoWhileTest {
    public static void main(String [] args) {
        int counter = 2;
        do
        {
            System.out.printf("%d ", counter);
            ++counter;
            if (counter % 4 == 2)
                System.out.println();
        } while (counter<=20);

        //System.out.println();
    }

}
