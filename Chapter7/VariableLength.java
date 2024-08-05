package Chapter7;

public class VariableLength {
    public static int product(int... numbers){
        int productSeries = 1;
        for (int i : numbers){
            productSeries *= i;
        }
        return productSeries;
    }
    public static void main(String[] args){
        int number1 = 20;
        int number2 = 10;
        int number3 = 12;
        int number4 = 19;
        int number5 = 22;

        System.out.println("Product Series: $"+ product(number1, number2));
        System.out.println("Product Series: $"+product(number3, number4));
        System.out.println("Product Series: $"+product(number3, number1));
        System.out.println("Product Series: $"+product(number5, number4, number3));
    }
}
