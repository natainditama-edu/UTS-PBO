import soal1.Course;

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
    }
}
