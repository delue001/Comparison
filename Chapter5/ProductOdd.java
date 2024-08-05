package Chapter5;

public class ProductOdd {
    public static void main(String [] args) {
        int product=1;
        for (int counter =1; counter<=15; counter+=2)
        {
            product = product * counter;
            System.out.println(product);

        }
    }
}
