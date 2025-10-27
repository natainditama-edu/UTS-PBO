package soal3;

import java.util.ArrayList;
import java.util.List;

/*
=============================
SOAL 3 - RELATIONSHIP antar CLASS (AGGREGATION)
=============================

Penjelasan:
- Aggregation = hubungan "memiliki" tapi objek tetap bisa berdiri sendiri.
- Student memiliki daftar Course, tapi Course tidak bergantung pada Student.
*/

public class Student {
    String name;
    String studentId;
    List<Course> courses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Courses:");
        System.out.println("--------------------");

        for (Course c : this.courses) {
            c.displayInfo();
            System.out.println("--------------------");
        }
    }
}
