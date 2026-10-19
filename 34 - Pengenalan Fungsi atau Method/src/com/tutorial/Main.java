package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //ini adalah fungsi atau method main yang akan dijalankan pertama kali saat program dijalankan
        Scanner input = new Scanner(System.in); //membuat objek scanner untuk membaca input dari user
        System.out.println("y = f(x)");
        System.out.println("f(x) = (x + 2) * x");

        int x;
        System.out.print("Masukkan nilai x: "); //menampilkan pesan ke user untuk memasukkan nilai x
        x = input.nextInt(); //membaca input dari user dan menyimpannya ke variabel x
        int y = hitung(x); //cara memanggil method hitung dengan parameter x dan menyimpan hasilnya ke variabel y
        System.out.println("Jika x = " + x + ", maka y = " + y);

    }


    //public atau private adalah akses modifier yang menentukan siapa saja yang dapat mengakses method atau variabel tersebut. Public berarti method atau variabel dapat diakses dari mana saja, sedangkan private berarti hanya dapat diakses dari dalam class itu sendiri.

    //static adalah keyword yang digunakan untuk mendeklarasikan method atau variabel yang bersifat statis. Method atau variabel statis dapat diakses tanpa harus membuat objek dari class tersebut.

    //lalu selanjutnya diisi oleh tipe data dan nama method atau variabel tersebut. Tipe data menentukan jenis data yang dapat disimpan oleh method atau variabel tersebut, sedangkan nama method atau variabel digunakan untuk mengidentifikasi method atau variabel tersebut.

    //setelah itu diisi oleh parameter yang digunakan untuk menerima input dari user. Parameter dapat berupa tipe data primitif atau objek.

    //void adalah tipe data yang digunakan untuk method yang tidak mengembalikan nilai apapun. Method dengan tipe data void hanya melakukan aksi tertentu tanpa mengembalikan nilai.

    public static int hitung(int x) { //ini adalah fungsi atau method hitung yang akan menghitung hasil dari a + b
        int hasil = (x + 2) * x; //menghitung hasil dari a + b dan menyimpannya ke variabel hasil
        return hasil;

    }
}