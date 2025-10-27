import soal1.*;
import soal2.*;
import soal3.*;

public class Main {
    public static void main(String[] args) {
        // =============================
        // SOAL 1 - CLASS dan OBJECT
        // =============================
        System.out.println("===== SOAL 1 - CLASS dan OBJECT =====");
        soal1.Course course1 = new soal1.Course("Pemrograman Berorientasi Objek", 3, "Dr. Andi");
        course1.displayInfo();

        // =============================
        // SOAL 2 - ENCAPSULATION
        // =============================
        System.out.println("\n===== SOAL 2 - ENCAPSULATION =====");
        soal2.Course course2 = new soal2.Course("Struktur Data", -2, "Dr. Budi");
        course2.displayInfo();

        // =============================
        // SOAL 3 - RELATIONSHIP (AGGREGATION)
        // =============================
        System.out.println("\n===== SOAL 3 - RELATIONSHIP (AGGREGATION) =====");
        soal3.Course c1 = new soal3.Course("Basis Data", 3, "Pak Joko");
        soal3.Course c2 = new soal3.Course("Jaringan Komputer", 2, "Bu Sinta");

        soal3.Student s1 = new soal3.Student("Rina", "S001");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.displayStudentInfo();
    }
}
