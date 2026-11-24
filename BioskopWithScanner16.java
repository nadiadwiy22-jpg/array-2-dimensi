import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            while (true) {
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                    System.out.println("Kursi tidak tersedia.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println(
                            "Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                } else {
                    break;
                }
            }
            penonton[baris - 1][kolom - 1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}