package Chapter5;

public class WhileCounter {
    public static void main(String [] args) {
        //int counter = 0;
        int total = 0;
        for (int counter = 2; counter <= 20; counter+=2)
        {
            total +=counter;
            System.out.printf("Sum is %d  ", total);
            //counter++;
        }
        //System.out.println("  ");
    }
}
