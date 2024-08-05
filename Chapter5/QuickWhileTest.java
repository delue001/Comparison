package Chapter5;

public class QuickWhileTest {
    public static void main(String [] args) {
        int i=1;
        while (i<=20) {
            System.out.print(i);
            if (i % 7 == 0)
                System.out.println();

            else
                System.out.print("\t");

            i++;
        }



        System.out.println(i);


    }
}
