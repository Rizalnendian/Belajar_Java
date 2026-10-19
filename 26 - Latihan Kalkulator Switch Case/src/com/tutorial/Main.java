package com.tutorial;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        float a,b;
        String operator;

        Scanner inputUser = new Scanner(System.in);

        inputUser = new Scanner(System.in);
        System.out.println("=== KALKULATOR ===");

        System.out.print("Masukkan angka pertama: ");
        a = inputUser.nextFloat();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = inputUser.next();

        System.out.print("Masukkan angka kedua: ");
        b = inputUser.nextFloat();

        System.out.println("==================");

        switch (operator) {
            case "+":
                System.out.printf("%f + %f = %f\n", a, b, (float) (a + b));
                break;
            case "-":
                System.out.printf("%f - %f = %f\n", a, b, (float) (a - b));
                break;
            case "*":
                System.out.printf("%f * %f = %f\n", a, b, (float) (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("%f / %f = %f\n", a, b, (float) (a / b));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }
    }
}
