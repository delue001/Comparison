import java.util.Arrays;
public class CompareMethod {
    public static void main(String [] args){
        int newarr [] = new int[]{
                1,2,3,4,5
        };
        int newarr2 [] = new int[] {
                1,2,3,4,5
        };
        int search = 0;
        System.out.println("The array, when passed to the  compare method, is: " + Arrays.compare(newarr, newarr2));
    }
}
