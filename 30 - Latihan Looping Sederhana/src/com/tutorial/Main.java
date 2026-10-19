package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int awal, akhir, total;
        System.out.print("Masukkan angka awal: ");
        awal = scanner.nextInt();
        System.out.print("Masukkan angka akhir: ");
        akhir = scanner.nextInt();

        System.out.print("Deret aritmatika dari " + awal + " sampai " + akhir + ": ");
        total = 0;
        for (int i = awal; i <= akhir; i++) {
            total += awal; //sama saja dengan total = total + awal
            awal++;
        }
        System.out.print(total + " ");


    }
}
