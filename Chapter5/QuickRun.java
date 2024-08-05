package Chapter5;

public class QuickRun {
    public static void main(String [] args) {
        int i;
        for (i = 1; i<=19; i+=2)
        {
            System.out.print(i);
            if (i % 3 == 0)
                System.out.println();
            else
                System.out.print("\t");
        }


    }
}
