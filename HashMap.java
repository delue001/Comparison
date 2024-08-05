import java.util.ArrayList;
import java.util.Map;

public class HashMap {
    public static void main(String [] a){
        /*ArrayList<Integer> rollNo = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        rollNo.add(1);
        names.add("Samuel");

        rollNo.add(2);
        names.add("Steve");

        rollNo.add(3);

        rollNo.add(4);
        names.add("Austin");

        rollNo.add(5);
        names.add("Ray");  */

        Map<Integer, String> students = new java.util.HashMap<>();
        students.put(1, "Samuel");
        students.put(2,"Steve");
        students.put(3,"");
        students.put(4,"Austin");
        System.out.println(students.get(1));
    }
}
