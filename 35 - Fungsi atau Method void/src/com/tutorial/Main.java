package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //void adalah tipe data kosong yang digunakan untuk menunjukkan bahwa metode tidak mengembalikan nilai apapun.
        selamatPagi("Rizal");
        fungsi("Ini adalah contoh fungsi");
        System.out.println(contoh());
    }

    private static void selamatPagi (String nama){
        System.out.println("Selamat pagi, " + nama);
    }

    //contoh fungsi yang tidak mengembalikan nilai
    //fungsi ini hanya mencetak input yang diberikan ke dalam console.
    //fungsi ini juga hanya akan menjalankan perintah yang ada di dalamnya tanpa mengembalikan nilai apapun.
    private static void fungsi (String input){
        System.out.println(input);
    }

    //contoh fungsi yang mengembalikan nilai float
    //dengan menggunakan kata kunci return, kita dapat mengembalikan nilai dari fungsi tersebut.
    //dan fungsi/method dengan tipe data selain void harus mengembalikan nilai sesuai dengan tipe data yang telah ditentukan.
    private  static float contoh (){
        return 1.5f;
    }
}
