import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    String nama;
    int harga;
    String kategori;

    public Menu(String nama, int harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
}

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Menu> daftarMenu = new ArrayList<>();

    public static void main(String[] args) {
        daftarMenu.add(new Menu("Karage Ramen", 26000, "Makanan"));
        daftarMenu.add(new Menu("Fishroll Ramen", 24000, "Makanan"));
        daftarMenu.add(new Menu("Katsu Ramen", 27000, "Makanan"));
        daftarMenu.add(new Menu("Niwatori Ramen", 35000, "Makanan"));
        daftarMenu.add(new Menu("Calamary Ramen", 27000, "Makanan"));
        daftarMenu.add(new Menu("Tokyo Banana", 17000, "Minuman"));
        daftarMenu.add(new Menu("Hot Lemon Tea", 10000, "Minuman"));
        daftarMenu.add(new Menu("Matcha Latte", 18000, "Minuman"));
        daftarMenu.add(new Menu("Ice Lemon Tea", 17000, "Minuman"));
        daftarMenu.add(new Menu("Air Mineral", 7000, "Minuman"));

        while (true) {
            System.out.println("\n==============================================");
            System.out.println("     SELAMAT DATANG DI RESTORAN ICHIRAKU");
            System.out.println("==============================================");
            System.out.println("1. Menu Pelanggan (Pemesanan)");
            System.out.println("2. Menu Pemilik (Manajemen Menu)");
            System.out.println("3. Keluar\n");
            System.out.print("Pilih menu: ");
            String pilih = input.nextLine();

            switch (pilih) {
                case "1":
                    menuPelanggan();
                    break;
                case "2":
                    menuPemilik();
                    break;
                case "3":
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }


    public static void menuPelanggan() {
        ArrayList<String> pesanan = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();

        System.out.println("\n==============================================");
        System.out.println("              DAFTAR MENU RESTORAN");
        System.out.println("==============================================");
        tampilkanMenu();

        while (true) {
            System.out.print("\nMasukkan nama menu yang ingin dipesan: \n(ketik 'selesai' untuk mengakhiri)\n");
            String namaPesanan = input.nextLine();

            if (namaPesanan.equalsIgnoreCase("selesai")) {
                if (pesanan.isEmpty()) {
                    System.out.println("Anda belum memesan apa pun!");
                    return;
                }
                break;
            }

            Menu menuDitemukan = null;
            for (Menu m : daftarMenu) {
                if (m.nama.equalsIgnoreCase(namaPesanan)) {
                    menuDitemukan = m;
                    break;
                }
            }

            if (menuDitemukan == null) {
                System.out.println("Menu tidak ditemukan! Silakan masukkan nama menu yang benar.");
                continue;
            }

            System.out.print("Masukkan jumlah: ");
            int jml;
            try {
                jml = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Jumlah tidak valid, coba lagi.");
                continue;
            }

            pesanan.add(menuDitemukan.nama);
            jumlah.add(jml);
        }

        cetakStruk(pesanan, jumlah);
    }


    public static void cetakStruk(ArrayList<String> pesanan, ArrayList<Integer> jumlah) {
        double subtotal = 0;
        int totalMinuman = 0;

        System.out.println("\n==============================================");
        System.out.println("             STRUK PEMBAYARAN RESTO");
        System.out.println("==============================================");

        for (int i = 0; i < pesanan.size(); i++) {
            String nama = pesanan.get(i);
            int jml = jumlah.get(i);
            int harga = cariHargaMenu(nama);
            String kategori = cariKategoriMenu(nama);
            double total = harga * jml;
            subtotal += total;

            if (kategori.equalsIgnoreCase("Minuman")) {
                totalMinuman += jml;
            }

            System.out.printf("%-20s x%-2d  Rp %,8.0f%n", nama, jml, total);
        }

        double pajak = subtotal * 0.10;
        int biayaPelayanan = 20000;
        double totalSetelahPajak = subtotal + pajak + biayaPelayanan;

        double diskon = 0;
        boolean promoMinuman = false;
        String infoPromo = "-";

        if (subtotal > 100000) {
            diskon = totalSetelahPajak * 0.10;
            infoPromo = "Diskon 10% diberikan.";
        } else if (subtotal > 50000 && totalMinuman > 0) {
            promoMinuman = true;
            infoPromo = "Promo Beli 1 Gratis 1 Minuman diterapkan.";
        }

        double totalAkhir = totalSetelahPajak - diskon;
        if (promoMinuman) totalAkhir -= 7000;

        System.out.println("----------------------------------------------");
        System.out.printf("%-25s Rp %,.0f%n", "Subtotal", subtotal);
        System.out.printf("%-25s Rp %,.0f%n", "Pajak (10%)", pajak);
        System.out.printf("%-25s Rp %,.0f%n", "Biaya Pelayanan", (double) biayaPelayanan);
        if (diskon > 0) System.out.printf("%-25s Rp -%,.0f%n", "Diskon 10%", diskon);
        if (promoMinuman) System.out.printf("%-25s Rp -%,.0f%n", "Gratis Minuman", 7000.0);
        System.out.println("----------------------------------------------");
        System.out.printf("%-25s Rp %,.0f%n", "TOTAL BAYAR", totalAkhir);
        System.out.println("----------------------------------------------");
        System.out.println("Promo: " + infoPromo);
        System.out.println("==============================================");
        System.out.println("  Terima kasih telah memesan di Restoran Kami!");
        System.out.println("==============================================");
    }


    public static void menuPemilik() {
        while (true) {
            System.out.println("\n==============================================");
            System.out.println("             MENU PEMILIK RESTORAN");
            System.out.println("==============================================");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Ubah Harga Menu");
            System.out.println("3. Hapus Menu");
            System.out.println("4. Lihat Daftar Menu");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");
            String pilih = input.nextLine();

            switch (pilih) {
                case "1":
                    tambahMenu();
                    break;
                case "2":
                    ubahHarga();
                    break;
                case "3":
                    hapusMenu();
                    break;
                case "4":
                    tampilkanMenu();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }


    public static void tambahMenu() {
        System.out.print("Masukkan nama menu baru: ");
        String nama = input.nextLine();
        System.out.print("Masukkan harga: ");
        int harga;
        try {
            harga = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid. Pembatalan penambahan.");
            return;
        }
        System.out.print("Masukkan kategori (Makanan/Minuman): ");
        String kategori = input.nextLine();

        if (kategori.equalsIgnoreCase("Makanan")) {

            int lastMakananIndex = -1;
            for (int i = 0; i < daftarMenu.size(); i++) {
                if (daftarMenu.get(i).kategori.equalsIgnoreCase("Makanan")) {
                    lastMakananIndex = i;
                }
            }
            if (lastMakananIndex == -1) {

                daftarMenu.add(0, new Menu(nama, harga, kategori));
            } else {
                daftarMenu.add(lastMakananIndex + 1, new Menu(nama, harga, kategori));
            }
        } else {

            daftarMenu.add(new Menu(nama, harga, kategori));
        }

        System.out.println("Menu berhasil ditambahkan!");
    }


    public static void ubahHarga() {
        tampilkanMenu();
        System.out.print("Masukkan nomor menu yang ingin diubah: ");
        int nomor;
        try {
            nomor = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input nomor tidak valid.");
            return;
        }

        int actualIndex = getIndexFromDisplayNumber(nomor);
        if (actualIndex == -1) {
            System.out.println("Nomor menu tidak valid!");
            return;
        }

        System.out.print("Yakin ingin mengubah harga menu ini? (Ya/Tidak): ");
        String konfirmasi = input.nextLine();

        if (konfirmasi.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan harga baru: ");
            int hargaBaru;
            try {
                hargaBaru = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Harga tidak valid. Pembatalan.");
                return;
            }
            daftarMenu.get(actualIndex).harga = hargaBaru;
            System.out.println("Harga berhasil diubah!");
        } else {
            System.out.println("Perubahan dibatalkan.");
        }
    }


    public static void hapusMenu() {
        tampilkanMenu();
        System.out.print("Masukkan nomor menu yang ingin dihapus: ");
        int nomor;
        try {
            nomor = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input nomor tidak valid.");
            return;
        }

        int actualIndex = getIndexFromDisplayNumber(nomor);
        if (actualIndex == -1) {
            System.out.println("Nomor menu tidak valid!");
            return;
        }

        System.out.print("Yakin ingin menghapus menu ini? (Ya/Tidak): ");
        String konfirmasi = input.nextLine();

        if (konfirmasi.equalsIgnoreCase("Ya")) {
            daftarMenu.remove(actualIndex);
            System.out.println("Menu berhasil dihapus!");
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }


    public static void tampilkanMenu() {
        int nomor = 1;

        System.out.println("\n>> Makanan:");
        for (Menu m : daftarMenu) {
            if (m.kategori.equalsIgnoreCase("Makanan")) {
                System.out.printf("%2d. %-20s - Rp %,d%n", nomor, m.nama, m.harga);
                nomor++;
            }
        }

        System.out.println("\n>> Minuman:");
        for (Menu m : daftarMenu) {
            if (m.kategori.equalsIgnoreCase("Minuman")) {
                System.out.printf("%2d. %-20s - Rp %,d%n", nomor, m.nama, m.harga);
                nomor++;
            }
        }
    }


    public static int getIndexFromDisplayNumber(int nomor) {
        int counter = 1;
        // cari makanan dulu
        for (int i = 0; i < daftarMenu.size(); i++) {
            if (daftarMenu.get(i).kategori.equalsIgnoreCase("Makanan")) {
                if (counter == nomor) return i;
                counter++;
            }
        }
        // lalu minuman
        for (int i = 0; i < daftarMenu.size(); i++) {
            if (daftarMenu.get(i).kategori.equalsIgnoreCase("Minuman")) {
                if (counter == nomor) return i;
                counter++;
            }
        }
        return -1;
    }


    public static int cariHargaMenu(String nama) {
        for (Menu m : daftarMenu) {
            if (m.nama.equalsIgnoreCase(nama)) {
                return m.harga;
            }
        }
        return 0;
    }

    public static String cariKategoriMenu(String nama) {
        for (Menu m : daftarMenu) {
            if (m.nama.equalsIgnoreCase(nama)) {
                return m.kategori;
            }
        }
        return "";
    }
}
