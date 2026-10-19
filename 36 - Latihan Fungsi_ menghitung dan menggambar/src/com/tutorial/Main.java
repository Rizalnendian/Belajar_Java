package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        int panjang, lebar;
        System.out.print("Masukan panjang: ");
        panjang = UserInput.nextInt();
        System.out.print("Masukan lebar: ");
        lebar = UserInput.nextInt();

        System.out.println("Hasil: ");
        gambarPersegi(panjang, lebar);
        cetakHasil(panjang, lebar);

    }
     private static int gambarPersegi(int panjang, int lebar) {
         for (int i = 0; i < lebar; i++) {
             for (int j = 0; j < panjang; j++) {
                 System.out.print("* ");
             }
             System.out.println("");
         }
         return 0;
     }

     private static int luasPersegi(int panjang, int lebar) {
         int luas = panjang * lebar;
         return luas;
     }

    private static int KelilingPersegi(int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }

    private static void cetakHasil(int panjang, int lebar) {
        System.out.println("Luas persegi panjang: " + panjang + " x " + lebar + " = " + luasPersegi(panjang, lebar));
        System.out.println("Keliling persegi panjang: ( " + panjang + " + " + lebar + " ) x 2 = " + KelilingPersegi(panjang, lebar));
    }
}
