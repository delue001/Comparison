package chapter3;

public class HeartRate {
    private String firstname;
    private String lastname;
    //private int dob;
    private int day;
    private int month;
    private int year;


    public HeartRate(String firstname, String lastname, int day, int month, int year){
        this.firstname = firstname;
        this.lastname = lastname;
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String firstname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }


    public int getPersonAge (){
        return 2023 - year;
    }
    public double getMaximumHeartRate(){
        return 220 - getPersonAge();
    }
    public double getTargetHeartRate(){
        return 0.85 * getMaximumHeartRate();
    }
}
