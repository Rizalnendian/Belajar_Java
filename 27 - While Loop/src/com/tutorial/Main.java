package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Masukkan jumlah perulangan : ");
        a = scanner.nextInt();

        System.out.println("Awal program");
        boolean kondisi = true;
        int i = 0;
         while(kondisi){
             System.out.println("while loop ke:" + i);

             if (i == a){
                    break;
//                    kondisi = false; // bisa juga menggunakan ini untuk menghentikan perulangan
             }

             i++;
         }
        System.out.println("Akhir program");
        System.out.println("Perulangan while adalah perulangan yang akan dijalankan selama kondisi bernilai true");
    }
}
