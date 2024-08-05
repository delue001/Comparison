import java.io.*;
               //Storing Data and Fetching Data from a file.
public class HandlingFile {
    public static void main(String [] a) throws Exception{
        String s;
        String s1;
        File f = new File("Demo.text");
        /*FileOutputStream fos = new FileOutputStream(f);   // To Store Data
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(s);
        dos.writeUTF(s1);*/
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        s = dis.readUTF();               // To Fetch Data
        s1 = dis.readUTF();
        System.out.println(s + "  " + s1);
    }
}
