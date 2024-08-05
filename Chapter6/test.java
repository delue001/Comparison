package Chapter6;

public class test {
        public static void main(String[] args) {
            myNumber();
            myMethod();
            myScope();

        }
        public static void myNumber()
        {
            int myNum = 5;
            System.out.println(myNum);
        }
        public static void myMethod()
        {
            float myFloat= 5.99f;
            System.out.println(myFloat);
        }
        public static void myScope()
        {
            String myText = "Hello";
            System.out.println(myText);
        }

}
