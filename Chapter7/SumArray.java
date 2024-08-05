package Chapter7;

public class SumArray {
    public static void main(String [] args){
        int[] array = {87, 68, 94, 100,83, 78,85,91,76,87};
        int total = 0;
        for (int counter = 0; counter < array.length; counter++)
            total = total + array[counter];

        System.out.printf("Total Array elements: %d%n",total);
    }
}
