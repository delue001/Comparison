package Chapter7;

public class InitArray {
    public static void main(String [] args) {
        int [] array = new int[10];
        array[0] = 5;
        array[1] = 5;
        array[2] = 0;
        array[3] = 8;
        array[4] = 7;
        array[5] = 7;
        array[6] = 6;
        array[7] = 2;
        array[8] = 15;
        array[9] = 15;

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%3d%8d%n",counter, array[counter]);
    }
}
