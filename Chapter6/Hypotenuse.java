package Chapter6;

public class Hypotenuse {
    public static void main(String [] a) {
        System.out.println(hypotenuse(3.0,4.0));
        System.out.println(hypotenuse(5.0, 12.0));
        System.out.println(hypotenuse(8.0, 12.0));
    }
    public static double hypotenuse(double side1, double side2) {
        double hypotenuse;
        hypotenuse = Math.sqrt((Math.pow(side1,3) + Math.pow(side2, 2)));
        return hypotenuse;
    }
}
