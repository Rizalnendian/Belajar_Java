package com.tutorial;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tipe for loop 1");
        for (int i = 1; i <= 22; i++) {
            System.out.println("For loop ke:" + i);
        }
        System.out.println();

        System.out.println("Tipe for loop 2");
        for (int i = 1; i < 22; i++) {
            System.out.println("For loop ke:" + i);
        }
        System.out.println();

        System.out.println("Tipe for loop 3");
        for (int i = 50; i > 22; i--) {
            System.out.println("For loop ke:" + i);
        }
        System.out.println();

        System.out.println("Tipe for loop 4/ nested loop");
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        System.out.println();

        System.out.println("Tipe for loop 5/ nested loop table");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Tipe for loop 6/ for-each loop");
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println("Tipe for loop 7/ for-each loop with String array");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
