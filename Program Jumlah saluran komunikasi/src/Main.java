import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        System.out.println("Program perhitungan jumlah saluran komunikasi");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah anggota: ");
        int jumlahSaluran = input.nextInt();

        System.out.println("Jumlah saluran komunikasi yang dapat dibentuk dari " + jumlahSaluran + " anggota adalah: " + hitungJumlahSaluran(jumlahSaluran));
    }

    public static int hitungJumlahSaluran(int jumlahSaluran) {
        int jumlahSaluranKomunikasi = (jumlahSaluran * (jumlahSaluran - 1)) / 2;
        return jumlahSaluranKomunikasi;

    }
}
