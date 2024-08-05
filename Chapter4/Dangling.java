package Chapter4;

public class Dangling {
    public static void main(String [] args) {
        int x = 9;   //b) x = 11, y = 9;
        int y = 11;

        if (x < 10)

            if (y > 10)
                System.out.println("*****");

            else

                System.out.println("#####");
        System.out.println("$$$$$");

    }
}
