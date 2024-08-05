package Chapter7;

public class InitArray2 {
    public static void main(String []a){
        int [] array = {32, 27, 64, 18, 95, 19, 90, 70, 60, 35};
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; array.length > counter; counter++)
            System.out.printf("%2d%7d%n", counter, array[counter]);
    }
}
