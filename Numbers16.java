import java.util.Arrays;
public class Numbers16 {
    public static void main(String[] args) {
        //langkah 2 : Deklarasi dan instansiasi array bertipe jagged
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        //Langkah 3 : Tampilkan isi setiap baris
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}
