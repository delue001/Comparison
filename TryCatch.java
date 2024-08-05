import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {
    public static void main(String [] args){
        try {
            int i, j;
            System.out.println("Enter 2 values");
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            i = Integer.parseInt(br.readLine());
            j = Integer.parseInt(br.readLine());

            int k = i * j;
            System.out.println(k);

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
