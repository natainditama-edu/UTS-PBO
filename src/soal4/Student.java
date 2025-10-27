package soal4;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, saya " + name + ", seorang mahasiswa.");
    }
}
