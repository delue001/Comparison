import java.util.Arrays;
public class ToStringMethod {
    public static void main(String [] args) {
        int newarr [] = new int[] {
                1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println("The array, when passed to the toString method is:" + Arrays.toString(newarr));
    }
}
