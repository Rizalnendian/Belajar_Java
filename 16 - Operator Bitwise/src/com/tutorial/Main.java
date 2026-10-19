package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //operator bitwise merupakan operator yang mengoperasikan nilai bit
        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits;
        System.out.println("-------------------");

        System.out.println("===Operator shift left atau geser kiri===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d (Kondisi Awal)\n", a_bits, a);
        b = (byte) (a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d (Setelah shift left) \n", b_bits, b);
        System.out.println();

        System.out.println("===Operator shift right atau geser kanan===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d (Kondisi Awal)\n", a_bits, a);
        b = (byte) (a >> 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d (Setelah shift right) \n", b_bits, b);
        System.out.println();

        System.out.println("===Operator shift bitwise or (|)===");
        System.out.println("Pada 8 posisi bit, jika terdapat posisi yang bernilai 1 maka hasilnya akan bernilai 1," +
                " jika semua posisi bernilai 0 maka hasilnya akan bernilai 0");

        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("==================Or");
        System.out.printf("%s = %d (Setelah bitwise or) \n", c_bits, c);
        System.out.println();

        System.out.println("===Operator bitwise and (&)===");
        System.out.println("Pada 8 posisi bit, jika terdapat posisi yang bernilai 1 dan 1 maka hasilnya akan bernilai 1," +
                " jika salah satu posisi bernilai 0 maka hasilnya akan bernilai 0");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("==================And");
        System.out.printf("%s = %d (Setelah bitwise and) \n", c_bits, c);
        System.out.println();

        System.out.println("===Operator bitwise xor (^)===");
        System.out.println("Pada 8 posisi bit, jika terdapat posisi yang salah satunya bernilai 1 maka hasilnya akan bernilai 1," +
                " jika semua posisi bernilai 1 maka hasilnya akan bernilai 0, dan jika keduanya bernilai 0 maka hasilnya akan 0");

        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("==================Xor");
        System.out.printf("%s = %d (Setelah bitwise xor) \n", c_bits, c);
        System.out.println();

        System.out.println("===Operator bitwise not (~)===");
        System.out.println("Pada 8 posisi bit, operator not akan membalikkan nilai setiap bit," +
                " jika bit bernilai 1 maka hasilnya akan bernilai 0, dan jika bit bernilai 0 maka hasilnya akan bernilai 1");

        a = 1;
        b = (byte) ~a;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d (Setelah bitwise not) \n", b_bits, b);
        System.out.println();

    }
}
