package com.tutorial;
import java.io.FileInputStream;

public static void main(String[] args) throws IOException {
    FileInputStream fileInput = new FileInputStream("input.txt");
    System.out.println((char)fileInput.read());
}