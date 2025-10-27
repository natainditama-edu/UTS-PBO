package soal4;

public class Lecturer extends Person {
    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, saya " + name + ", seorang dosen.");
    }
}
