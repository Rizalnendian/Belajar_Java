package com.tutorial;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue; //skip looping jika syarat terpenuhi
            }
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; //memberhentikan looping jika syarat terpenuhi
            }
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; //memberhentikan program java
            }
            System.out.println(i);
        }

    }
}
