package soal3;

/*
Class Course digunakan kembali di soal3 untuk hubungan Aggregation
*/

public class Course {
    String courseName;
    int credit;
    String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.credit = credit;
        this.instructorName = instructorName;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Credit: " + this.credit);
        System.out.println("Instructor: " + this.instructorName);
    }
}
