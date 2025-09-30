package present;
import java.util.Scanner;

public class Main {
    private static Product[] products = {
        new Electronic("Laptop", 10000000),
        new Food("Roti", 20000),
        new Clothing("Kaos", 100000)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    menuLihatProduk();
                    break;
                case 2:
                    menuTambahProduk(sc);
                    break;
                case 3:
                    System.out.println("chill.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);

        sc.close();
    }

    // ===== METHOD =====
    public static void menuLihatProduk() {
        System.out.println("\n=== Daftar Produk ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void menuTambahProduk(Scanner sc) {
        System.out.println("\n=== Tambah Produk Baru ===");
        System.out.print("Masukkan nama produk: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan harga dasar: ");
        double harga = sc.nextDouble();

        System.out.println("Pilih jenis produk:");
        System.out.println("1. Electronic");
        System.out.println("2. Food");
        System.out.println("3. Clothing");
        System.out.print("Pilihan: ");
        int jenis = sc.nextInt();

        Product baru = null;
        switch (jenis) {
            case 1:
                baru = new Electronic(nama, harga);
                break;
            case 2:
                baru = new Food(nama, harga);
                break;
            case 3:
                baru = new Clothing(nama, harga);
                break;
            default:
                System.out.println("Jenis tidak valid!");
        }

        if (baru != null) {
            Product[] temp = new Product[products.length + 1];
            for (int i = 0; i < products.length; i++) {
                temp[i] = products[i];
            }
            temp[products.length] = baru; 
            products = temp;

            System.out.println("\nProduk ditambahkan!");
        }
    }
}
