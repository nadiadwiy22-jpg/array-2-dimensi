import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
         System.out.println("\nMenu  Fungsi");
            System.out.println("1     Input data penonton");
            System.out.println("2     Tampilkan daftar penonton");
            System.out.println("3     Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();   

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris - 1][kolom - 1] = nama;

                } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {         
                            System.out.print("***\t");         
                        } else {                               
                            System.out.print(penonton[i][j] + "\t");
                        }                                      
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                break;
            }
        }
    }
}