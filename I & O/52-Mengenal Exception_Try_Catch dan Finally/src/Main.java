import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public void main(String[] args) {
    int [] array = {0,1,2,3};

    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukan nilai ke: ");
    int index = userInput.nextInt();
    FileInputStream fileInput = null;


    // exception handling (try, catch, finally)
    System.out.println("Handling out of bound");
    try {
        System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
    } catch (Exception exception_message){
        System.err.println(exception_message);
    } //mengatasi error runtime dengan tetap melanjutkan program selanjutnya

    //runtime error jika file tidak ada
    System.out.println("Handling IO not Found");
    try {
        fileInput = new FileInputStream("input.txt");
    } catch (IOException e){
        System.err.println(e);
    }

    //menggabungkan dua exception
    System.out.println("Menggabungkan dua exception");
    try {
        System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
        fileInput = new FileInputStream("input.txt");
    }catch (ArrayIndexOutOfBoundsException e){
        System.err.println("Array yang dimasukakan melebihi batas jumlah Array");
    } catch (FileNotFoundException e){
        System.err.println("File input tidak ditemukan");
    }

    System.out.println("Menambahkan finnaly");
    //Finally
    try {
        System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.err.println("Array yang dimasukakan melebihi batas jumlah Array");
    } finally {
        System.out.println("Finnaly");
    }

    System.out.println("\nAkhir Program");




}