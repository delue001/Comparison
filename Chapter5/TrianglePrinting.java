package Chapter5;

public class TrianglePrinting {
    public static void main(String [] args) {
        System.out.println("(a)");
        for (int i =1; i<=10; i++)
        {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();

        System.out.println("(b)");
        for (int i=1; i<=10; i++)
        {
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();

        System.out.println("(c)");
        for (int i=1; i<=10; i++)
        {
            for (int k=1; k < i; k++)
            {
                System.out.print(" ");
            }
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("(d)");
        for (int i = 1; i <=10; i++)
        {
            for (int k = 10; k > i; --k)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
