package Chapter7;

public class GradeBookTest {
    public static void main(String [] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBook obj = new GradeBook("CSC101 Introduction to Java Programming",gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",obj.getCourseName());
        obj.processGrades();
    }
}
