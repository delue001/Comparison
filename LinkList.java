import java.util.LinkedList;

public class LinkList {
    public static void main(String []a){
        LinkedList<Integer> values = new LinkedList<>();    // Java Set Hash Sorted Treeset
        values.add(3);
        values.add(4);
        values.add(6);

        values.add(2,20);
        for (int i : values){
            System.out.println(i);
        }
    }
}
