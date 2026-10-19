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

        do {

            System.out.println("do while loop ke:" + i);
            if (i == a){
//                break;
                kondisi = false;
            }
            
            i++;

        } while (kondisi);

        System.out.println("Akhir program");
        System.out.println("Perulangan do while adalah perulangan yang akan dijalankan minimal satu kali, walaupun kondisi bernilai false");
    }
}
