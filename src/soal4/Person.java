package soal4;

/*
=============================
SOAL 4 - INHERITANCE dan POLYMORPHISM
=============================

Penjelasan:
- Inheritance = pewarisan sifat dari class induk ke anak.
- Polymorphism = method yang sama tapi hasilnya berbeda tergantung objek.
*/

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, saya " + name);
    }
}
