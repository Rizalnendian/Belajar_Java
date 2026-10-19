package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

        int HasilInteger;
        HasilInteger = tambah(5,5);
        printAngka(HasilInteger);

        float HasilFloat;
        HasilFloat = tambah(5, 3.1415926535897932384626433f);
        printAngka(HasilFloat);


        printAngka(12);
        printAngka(3.1415926535897932384626433f);
        printAngka(3.1415926535897932384626433d);

    }


    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }
    private static float tambah(float angkaFloat1, float angkaFloat2) {
        return angkaFloat1 + angkaFloat2;
    }
    private static void printAngka (int angkaInteger) {
        System.out.println("Ini angka integer yang bernilai: " + angkaInteger);
    }
    private static void printAngka (float angkaFloat) {
        System.out.println("Ini angka float yang bernilai: " + angkaFloat);
    }
    private static void printAngka (double angkaDouble) {
        System.out.println("Ini angka double yang bernilai: " + angkaDouble);
    }
}
