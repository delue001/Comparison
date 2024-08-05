package Chapter5;

public class Factorial {
      public static void main(String [] args) {
        System.out.println("Number: factorial:");
        for (int i =1; i<=20; ++i) {

            long factorial = 1;
            for (int j = 1; j <= i; j++)
                factorial=factorial*j;
            System.out.printf("%d!\t = \t%d%n",i, factorial);
        }
    }

}
