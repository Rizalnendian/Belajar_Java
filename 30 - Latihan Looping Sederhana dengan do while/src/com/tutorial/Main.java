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

        System.out.println("Deret aritmatika dari " + awal + " sampai " + akhir + ": ");
        total = 0;
        do {
            total += awal; //sama saja dengan total = total + awal
            awal++;
        } while (awal <= akhir);
        System.out.println("total = " + total);
    }
}
