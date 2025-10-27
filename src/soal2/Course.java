package soal2;

/*
=============================
SOAL 2 - ENCAPSULATION
=============================

Penjelasan:
- Encapsulation melindungi data agar tidak diubah sembarangan.
- Atribut dibuat private, diakses lewat getter/setter.
*/

public class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.setCredit(credit); // pakai setter biar validasi tetap jalan
        this.instructorName = instructorName;
    }

    // Setter dengan validasi agar credit tidak negatif
    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Credit tidak boleh negatif. Diset ke 0.");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public int getCredit() {
        return this.credit;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Credit: " + this.credit);
        System.out.println("Instructor: " + this.instructorName);
    }
}

