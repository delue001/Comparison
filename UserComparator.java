import java.util.ArrayList;
import java.util.Collections;

public class UserComparator {
    public static void main(String[] a){
        ArrayList<Emp> emps = new ArrayList<>();

        emps.add(new Emp(5,"Russia"));
        emps.add(new Emp(1,"Canada"));
        emps.add(new Emp(2, "England"));
        emps.add(new Emp(6,"england"));

        Collections.sort(emps);

        for (Emp e : emps){
            System.out.println(e);
        }

    }
}
class Emp implements Comparable<Emp>{
    int eId;
    String eName;
    public Emp(int Id,String name){
        eId = Id;
        eName = name;
    }
    public String toString(){
        return eId + " : " + eName;
    }

    public int compareTo(Emp obj){
        return this.eName.compareToIgnoreCase(obj.eName)* -1;
    }
}
