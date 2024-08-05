package chapter3;

import chapter3.Date;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date(12, 21, 2023);

        System.out.printf(" chapter3.Date: %s/%s/%s%n", date.getMonth(), date.getDay(), date.getYear());
    }
}
