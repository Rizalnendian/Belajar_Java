package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kotak");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Segitiga Siku-Siku atas kanan");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Segitiga Siku-Siku atas kiri");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i + j >= 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();





        System.out.println("Segitiga Siku-Siku bawah kanan");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i + j == 4) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Segitiga Siku-Siku bawah kiri");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i) {
                    System.out.print("* "); // Mencetak bagian biru
                } else {
                    System.out.print("  "); // Spasi kosong untuk bagian abu-abu
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Segitiga Sama Kaki kanan");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j || i + j == 8) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();

        int n = 5; // Jumlah baris untuk segitiga sama kaki
        for (int i = 1; i <= n; i++) {
            // Cetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // --- BAGIAN BAWAH ---
        for (int i = n - 1; i >= 1; i--) {
            // Cetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}