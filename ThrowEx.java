import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThrowEx {
    public static void main(String [] args) throws Exception {
        String s,f = "";
        System.out.println("Enter a string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        f = br.readLine();
        System.out.printf("%s%n ", s + f);
    }
}
