import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaList {
    public static void main(String[] args) throws Exception {
        List<Integer> c = new ArrayList<>();  //Generics with List<> which can be double type or float type

        c.add(6);
        c.add(7);
        c.add(9);
        c.add(20);
        c.add(50);

        System.out.println("Size :" + c.size());
        System.out.println(c.get(2));
        c.add(2,40);

        c.remove(5);
        Collections.sort(c, new Comparator<Integer>() {
            public int compare(Integer i, Integer k){
                /*int result = 1;
                if (i<k){
                    result = 1;
                }
                else if (i>k) {
                    result = -1;
                }
                else
                    result = 0;
                return result;*/
                //Ternary Operator
                return i<k?1: i>k?-1: 0;
            }

        }); // Order of arrangements


        for (Integer i : c){
            System.out.println(i);
        }

    }

}
