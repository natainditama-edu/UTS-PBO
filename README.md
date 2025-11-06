# ☕ UTS Pemrograman Berorientasi Objek (Java)

💻 Program Java berbasis **OOP (Object-Oriented Programming)** yang mengimplementasikan konsep:  
**Class & Object, Encapsulation, Aggregation, Inheritance, Polymorphism, Abstract Class, dan Interface**.

Proyek ini terdiri dari **5 soal** yang dipisahkan dalam package `soal1` sampai `soal5`,  
dan dijalankan melalui file utama `Main.java`.

<p>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/graphs/contributors">
    <img src="https://img.shields.io/github/contributors/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="contributors" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/issues/">
    <img src="https://img.shields.io/github/issues/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="open issues" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/network/members">
    <img src="https://badgen.net/github/forks/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="forks" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/graphs/commit-activity">
    <img src="https://badgen.net/github/commits/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="commits count" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/stargazers">
    <img src="https://badgen.net/github/stars/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="stars" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama.svg" alt="license" />
  </a>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama">
    <img src="https://img.shields.io/github/last-commit/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" alt="last update" />
  </a>
</p>

<h4>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama">📘 Documentation</a>
  <span> · </span>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/issues/">🐛 Report Bug</a>
  <span> · </span>
  <a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/issues/">💡 Request Feature</a>
</h4>

---

## 🚀 Getting Started

### 🧰 Prerequisites

Pastikan kamu sudah menginstal:

* ☕ [Java JDK 21 atau lebih baru](https://adoptium.net/temurin/releases)
* 🧭 [Git Version Control](https://git-scm.com/downloads)
* 🧠 [IntelliJ IDEA](https://www.jetbrains.com/idea/download) atau IDE Java lainnya

---

### ⚙️ Installation & Run

Clone repository:

```bash
git clone https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama.git
````

Masuk ke folder project:

```bash
cd UTS-2401010039-NyomanCandraNataInditama/src
```

Kompilasi semua file Java:

```bash
javac Main.java soal1/*.java soal2/*.java soal3/*.java soal4/*.java soal5/*.java
```

Jalankan program:

```bash
java Main
```

---

## 📖 Deskripsi Program

Program ini merupakan implementasi dari **konsep dasar Pemrograman Berorientasi Objek (OOP)** menggunakan Java.
Setiap soal merepresentasikan konsep OOP yang berbeda:

| 🧩 Soal | 🧠 Konsep OOP              | 📘 Deskripsi Singkat                                                  |
| ------- | -------------------------- | --------------------------------------------------------------------- |
| **1**   | Class & Object             | Membuat class `Course` dan menampilkan informasinya                   |
| **2**   | Encapsulation              | Menambahkan validasi agar `credit` tidak negatif                      |
| **3**   | Aggregation (Relationship) | `Student` memiliki daftar `Course`                                    |
| **4**   | Inheritance & Polymorphism | Pewarisan dari `Person` ke `Student` dan `Lecturer`                   |
| **5**   | Abstract Class & Interface | `Assessment`, `Exam`, dan `Assignment` mengimplementasikan `Gradable` |

---

### 💡 Contoh Output

```
===== SOAL 1 - CLASS dan OBJECT =====
Course Name: Pemrograman Berorientasi Objek
Credit: 3
Instructor: Dr. Andi

===== SOAL 2 - ENCAPSULATION =====
Credit tidak boleh negatif. Diset ke 0.
Course Name: Struktur Data
Credit: 0
Instructor: Dr. Budi

===== SOAL 3 - RELATIONSHIP (AGGREGATION) =====
Student: Rina (S001)
Courses:
Course Name: Basis Data
Credit: 3
Instructor: Pak Joko
--------------------
Course Name: Jaringan Komputer
Credit: 2
Instructor: Bu Sinta
--------------------

===== SOAL 4 - INHERITANCE & POLYMORPHISM =====
Hi, saya Dewi, seorang mahasiswa.
Hi, saya Pak Arif, seorang dosen.

===== SOAL 5 - ABSTRACT CLASS & INTERFACE =====
Exam Score: 78.0 | Grade: B
Assignment Score: 92.0 | Grade: A
```

---

## 🤝 Contributing

<a href="https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=natainditama-edu/UTS-2401010039-NyomanCandraNataInditama" />
</a><br/>

Kontribusi selalu terbuka!
Silakan buat **issue** atau **pull request** untuk perbaikan dan pengembangan program.

---

## 📜 License

Proyek ini dilisensikan di bawah **MIT License**.
Lihat file [LICENSE](https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama/blob/main/LICENSE) untuk informasi lebih lanjut.

---

## 📬 Contact

**Nyoman Candra Nata Inditama**
📎 [LinkedIn](https://linkedin.com/in/natainditama/)

📦 Project Link: [https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama](https://github.com/natainditama-edu/UTS-2401010039-NyomanCandraNataInditama)
