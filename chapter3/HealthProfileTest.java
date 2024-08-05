package chapter3;

import chapter3.HealthProfile;

public class HealthProfileTest {
    public static void main(String [] args){
        HealthProfile healthProfile = new HealthProfile("Jane", "Doe",
                "Male", 12, 12, 1980, 74.4, 165.34);

        System.out.printf("%n Firstname: %s%n Lastname: %s%n Gender: %s%n DateOfBirth: %s/%s/%s%n " +
                        "HeightInches: %s Inches%n WeightPounds: %s pounds%n",
                healthProfile.getFirstname(),healthProfile.getLastname(),healthProfile.getGender(),
                healthProfile.getMonth(),
                healthProfile.getDay(),healthProfile.getYear(),healthProfile.getHeightInches(),
                healthProfile.getWeightInPounds());

        System.out.printf("%n UserAge: %s%n BMI: %.2f%n TargetHeartRate: %.2f%n MaximumHeartRate: %s%n%n",
                healthProfile.getUserAge(), healthProfile.getBmi(),healthProfile.getTargetHeartRate(),
                healthProfile.getMaximumHeartRate());

        System.out.printf("BMI = %s%n", healthProfile.getBmi());
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
