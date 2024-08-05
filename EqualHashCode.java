public class EqualHashCode {
    public static void main(String[] a){
        Employ obj1 = new Employ(1,"Godwin");
        Employ obj2 = new Employ(1,"Godwin");
        System.out.println(obj1);
        System.out.println(obj2);
        if (obj1.equals(obj2)){
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not Equals");
        }

    }
}
class Employ{
    int eId;
    String eName;
    public Employ(int Id, String Name){
        eId = Id;
        eName = Name;
    }
    public boolean equals(Emp obj){
        boolean result = false;
        if (eId==obj.eId && eName.equals(obj.eName)){
            result = true;
        }
        return result;
    }

    public int hashCode() {
        return eId + 5000 + eName.length();
    }

    @Override
    public String toString() {
        return "Employ[" + "eId=" + eId + ", eName='" + eName + "toString()=" + super.toString() +"]";
    }
}
