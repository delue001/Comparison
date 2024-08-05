import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String [] args) throws Exception{
        //String s = " ";
        System.out.println("Enter Your Name: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("My Name is " + s);


    }
}
