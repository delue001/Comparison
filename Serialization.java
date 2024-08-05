import java.io.*;

public class Serialization {
    public static void main(String[] args) throws Exception{
        Cricket c = new Cricket();
        c.runs = 50;
        c.batsman = " Deluxe";
        c.balls = 60;
        File f = new File("Serial.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);

        Cricket c1;
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        c1 = (Cricket) ois.readObject();
        System.out.println(c1.runs+ " " + c1.batsman + " " + c1.balls);
    }

}
class Cricket implements Serializable
{
    int runs;
    String batsman;
    transient int balls; // Transient does not store variable in a file
}
