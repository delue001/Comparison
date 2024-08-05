package Chapter4;

//import java.util.Scanner;
public class Tabular {
    public static void main(String [] args) {
        //Scanner input = new Scanner(System.in);
        int N=1;
        System.out.println("N   10*N  100*N  1000*N");

        while (N<=5){
            System.out.println(N+"   "+N*9+"    "+N*100+"    "+N*1000);
            N++;
        }
    }
}
