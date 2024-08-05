import java.util.ArrayList;
import java.util.Collection;

public class JavaCollection {
    public static void main(String [] args) throws Exception {
        Collection c = new ArrayList();

        c.add(4);
        c.add(2);
        c.add(8);
        c.add(20);
        System.out.println("Size " + c.size());
        for (Object i : c){
            System.out.println(i);
        }

    }

}
