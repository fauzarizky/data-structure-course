import java.util.LinkedList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Soal:
            1. Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘jumlahBaris’?
            2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kalimatBaru’ yang berisi kata ‘Deklarasi tipe data String’?
            3. Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23)?
            4. Buatlah pendeklarasian array dua dimensi dengan nama ‘alfabet’, tipe data String, yang terdiri dari tiga baris dan tiga kolom
            // psn, wlb, fre
            5. Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (26, 08, 23, 24, 16)?
         */

        Integer jumlahBaris = 5;
        String kalimatBaru = "Deklarasi tipe data String";
        
        Integer[] empatAngka = {07, 10, 20, 23};
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"},
        };

        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.println("Jumlah Baris: " + jumlahBaris);
        System.out.println("Kalimat Baru: " + kalimatBaru);
        System.out.println("Empat Angka: " + Arrays.toString(empatAngka));
        System.out.println("Alfabet: ");
        for (String[] row : alfabet) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("List Angka: " + listAngka);
    }
}
