package oop_00000130426_RafiAthallahAhmadHaryanto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukan Nama: ");
    val name = scanner.nextLine()
    print("Masukan NIM (Wajib 5 Karakter): ");
    val nim = scanner.next()

    scanner.nextLine() // Clean Buffer

    // Validasi di sisi pemanggil (Main)
    if(nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    }else {
        print("Pilih jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() //Consume newLine

        if(type == 1) {
            print("Masukan Jurusan: ")
            val major = scanner.nextLine()
            // Memanggil Primary Constructor
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        }else if(type == 2) {
            // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        }else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}