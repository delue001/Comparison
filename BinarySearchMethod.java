import java.util.Arrays;
public class BinarySearchMethod {
    public static void main(String [] args) {
        int newarr [] = new int[] {
                1,2, 3,4,5,6
        };
        int search = 4;
        System.out.println("The array, when passed to the binary search method is: " + Arrays.binarySearch(newarr, search));
    }
}
