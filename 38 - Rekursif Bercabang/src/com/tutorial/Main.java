package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int n;
        System.out.print("Masukan nilai nilai n Fibonacci: ");
        n = userInput.nextInt();
        int nilai_fibonacci = Fibonacci(n, "atas");
        System.out.println("Fibonacci ke: " + n + " adalah " + nilai_fibonacci);
    }

    private  static int Fibonacci(int n, String daun) {
        System.out.println("Daun: " + daun);
        System.out.println("Fibonacci ke: " + n);
        System.out.println();
        if (n == 1 || n == 0) {
            return n;
        } else{
            return Fibonacci(n-1,"kiri")+ Fibonacci(n-2, "kanan");
        }

    }
}
