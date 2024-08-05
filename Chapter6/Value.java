package Chapter6;

public class Value {
    public static void main(String [] a){
        System.out.printf("Value of X = %f%n",Math.abs(7.5));
        System.out.printf("Value of X = %f%n",Math.floor(7.5));
        System.out.printf("Value of X = %f%n",Math.abs(0.0));
        System.out.printf("Value of X = %f%n",Math.ceil(0.0));
        System.out.printf("Value of X = %f%n",Math.abs(-6.4));
        System.out.printf("Value of X = %f%n",Math.ceil(-6.4));
        System.out.printf("Value of X = %f%n",Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
    }
}
