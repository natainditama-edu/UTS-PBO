package soal1;

/*
=============================
SOAL 1 - CLASS dan OBJECT
=============================

Penjelasan:
- Class = blueprint / cetakan untuk membuat object.
- Object = hasil nyata dari class.
Contoh: Course oop = new Course("OOP", 3, "Dr. Andi");
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
