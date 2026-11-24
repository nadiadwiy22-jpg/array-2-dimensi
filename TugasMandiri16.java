import java.util.Scanner;
public class TugasMandiri16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;
        int[][] survey = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        //1. Menyimpan hasil survey dari user 
        System.out.println("=== SILAKAN ISI DATA SURVEY (Nilai 1-5) ===");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1 ) + ":");
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        //2. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\n--- RATA RATA TIAP RESPONDEN ---");
        double totalSemuaData = 0;
        for (int i = 0; i < survey.length; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < survey[i].length; j++) {
                totalPerResponden += survey[i][j];
                totalSemuaData += survey[i][j];
            }
            double rataResponden = totalPerResponden / survey[i].length;
            System.out.println("responden ke-" + (i + 1) + " = " + rataResponden);
        }

        //3. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\n--- RATA RATA TIAP PERTANYAAN ---");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++){
                totalPertanyaan += survey[i][j];
            }
            double rataPertanyaan = totalPertanyaan / JUMLAH_RESPONDEN;
            System.out.println("Pertanyaan ke-" + (j+1) + " = " + rataPertanyaan);

            //4. Menampilkan nilai rata-rata secara keseluruhan
            double rataKeseluruhan = totalSemuaData / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
            System.out.println("\n================================");
            System.out.println("Rata-rata Keseluruhan Survei = " + rataKeseluruhan);
            System.out.println("================================");

            sc.close();
         }
    }
}
