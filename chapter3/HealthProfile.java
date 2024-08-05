package chapter3;

public class HealthProfile {
    private String firstname;
    private String lastname;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double heightInches;
    private double weightInPounds;

    public HealthProfile(String firstname, String lastname, String gender, int month, int day,
                         int year, double heightInches, double weightInPounds){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.heightInches = heightInches;
        this.weightInPounds = weightInPounds;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setHeightInches(double heightInches) {
        this.heightInches = heightInches;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }
    public int getUserAge(){
        return 2023 - year;
    }
    public double getMaximumHeartRate(){
        return 220 - getUserAge();
    }
    public double getTargetHeartRate(){
        return 0.85 * getMaximumHeartRate();
    }
    public double getBmi(){
        return (getWeightInPounds() * 703) / (getHeightInches() * getHeightInches());
    }
}
