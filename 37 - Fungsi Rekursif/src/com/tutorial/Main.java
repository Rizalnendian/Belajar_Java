package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = input.nextInt();
        System.out.println("Nilai yang dimasukkan: " + nilai);


        cetakNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah nilai: " + jumlah);
        int fa = faktorialNilai(nilai);
        System.out.println("Faktorial nilai: " + fa);


    }

    private static int faktorialNilai (int parameter) {
        if (parameter == 1) {
            return parameter;
        }
        return parameter * faktorialNilai(parameter - 1);
    }
    private static int jumlahNilai (int parameter) {

        if (parameter == 0) {
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    private static void cetakNilai (int parameter) {
        System.out.println("Nilai yang dicetak: " + parameter);
        if (parameter == 0) {
            return;
        }
        parameter --;
        cetakNilai(parameter);
    }
}
