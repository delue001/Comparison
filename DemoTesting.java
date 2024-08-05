import java.util.ArrayList;
import java.util.Iterator;

public class DemoTesting {
    public static void main(String [] a) {
        ArrayList<String> values = new ArrayList<>();
        values.add("Colombia");
        values.add("China");
        values.add("Russia");

        Iterator<String> it = values.iterator();
        while (it.hasNext()){
            String i = it.next();
            System.out.println(i);
        }
    }
}