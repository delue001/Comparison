package Chapter5;

public class OddInteger {
    public static void main(String [] args) {
        int sum=0;

        for (int count=1; count<=99; count+=2){
            sum +=count;
            System.out.printf("%d, ",count);
        }
        double result = Math.pow(2.5, 3);
        System.out.printf(" %n%s",result);


    }
}
