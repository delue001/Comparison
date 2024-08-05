package chapter3;

import chapter3.HeartRate;

public class HeartRateTest {
    public static void main(String[] args){
        HeartRate heartrate = new HeartRate("John", "Shitty",20, 10, 1990);
        System.out.printf("%n Firstname:%s%n Lastname:%s%n", heartrate.getFirstname(),
                heartrate.getLastname());

        System.out.printf(" chapter3.Date of birth:%s/%s/%s", heartrate.getDay(),
                heartrate.getMonth(), heartrate.getYear());


        System.out.printf("%n PersonAge: %s", heartrate.getPersonAge());

        System.out.printf("%n MaximumHeartRate: %s%n TargetHeartRate:%s", heartrate.getMaximumHeartRate(),
                heartrate.getTargetHeartRate());


    }
}
