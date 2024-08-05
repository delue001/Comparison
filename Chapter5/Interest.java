package Chapter5;

public class Interest {
    public static void main(String [] args) {
        double principal = 1000.0;
        //double rate = 0.05;
        double amountDeposit;

        for (double rate = 0.05; rate<=0.1; rate+=0.01)
        {
            System.out.println("Interest at " + rate + " rate ");
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; year++) {
                amountDeposit = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.3f%n", year, amountDeposit);

            }
        }
        System.out.println(Math.sqrt(900.0));
    }
}
