import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        //Langkah 3 : Input nilai dengan Scanner dan nested loop
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            //Langkah 4 : Hitung dan tampilkan rata rata setiap mahasiswa
                System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }

            //Langkah 5 : Hitung dan tampilkan rata-rata setiap mata kuliah
                System.out.println("\n========================================");
 System.out.println("Rata-rata nilai setiap mata kuliah:");
for (int j = 0; j < nilai[0].length; j++) {
    double totalPerMatkul = 0;
    for (int i = 0; i < nilai.length; i++) {
        totalPerMatkul += nilai[i][j];
 }
        System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
}
        sc.close();
            }
        }