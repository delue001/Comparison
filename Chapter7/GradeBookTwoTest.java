package Chapter7;

public class GradeBookTwoTest {
    public static void main(String[] args) {
        int[][] gradesArray =  {{87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 94},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};
        GradeBookTwo myBook = new GradeBookTwo("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",myBook.getCourseName());
        myBook.processGrades();
    }
}
