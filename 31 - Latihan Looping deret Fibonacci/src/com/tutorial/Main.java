package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int fn, fn_1, fn_2, n;
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        n = inputUser.nextInt();

        fn_2 = 0;
        fn_1 = 1;
        fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("Nilai ke - " + i + " adalah: " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

        }


    }
}
