public class App {
    public static void main(String[] args) {
        /**
        * Kondisi:
        Seorang Programmar diberi tugas untuk membuat aplikasi untuk dapat menyimpan 
        data barang yang berada di setiap ruangan pada sebuah Gedung. Gedung tersebut terdiri dari 2 lantai, 
        disetiap lantai terdapat 5 ruangan termasuk toilet dan mushola. Disetiap ruangan terdapat 4 barang didalamnya.
        
        * Tugas:
        Buatlah variabel dari data gedung, lantai, ruangan, barang dengan cara memilih:
        a. Tipe data yang sesuai,
        b. Menamai variabel tersebut,
        c. Cara penulisan tipe data,
        d. Alasan memilih tipe data tersebut.
        */
        
        /* Jawaban: */
        String gedung = "Suatu Gedung";
        String[] lantai = new String[2]; // [lantai]
        String[][] ruangan = new String[2][5]; // [lantai][ruangan]
        String[][][] barang = new String[2][5][4]; // [lantai][ruangan][barang]

        /*
         * Penjelasan tipe data:
         * Tipe data string dipilih karena nama gedung biasanya berupa teks yang dapat terdiri dari huruf, angka, dan karakter khusus.
         * Tipe data array string pada variabel lantai dipilih karena untuk menyimpan nilai yang lebih dari satu pada suatu variabel kita memerlukan array.
         * Tipe data array dua dimensi pada variabel ruangan dipilih karena dimensi pertama digunakan untuk menyimpan informasi tentang lantai, dan dimensi kedua digunakan untuk menyimpan informasi tentang ruangan di setiap lantai.
         * Tipe data array tiga dimensi pada variabel barang dipilih karena dimensi pertama mewakili lantai, dimensi kedua mewakili ruangan, dan dimensi ketiga mewakili barang di dalam ruangan tersebut.
         */

        // Mengisi data gedung
        lantai[0] = "Lantai 1";
        lantai[1] = "Lantai 2";

        ruangan[0][0] = "Ruang 1 Lantai 1";
        ruangan[0][1] = "Ruang 2 Lantai 1";
        ruangan[0][2] = "Ruang 3 Lantai 1";
        ruangan[0][3] = "Toilet Lantai 1";
        ruangan[0][4] = "Mushola Lantai 1";

        ruangan[1][0] = "Ruang 1 Lantai 2";
        ruangan[1][1] = "Ruang 2 Lantai 2";
        ruangan[1][2] = "Ruang 3 Lantai 2";
        ruangan[1][3] = "Toilet Lantai 2";
        ruangan[1][4] = "Mushola Lantai 2";

        // Contoh barang di dalam ruangan:
        // Mengisi data barang di dalam ruangan lantai 1
        barang[0][0][0] = "Barang 1 Ruang 1 Lantai 1";
        barang[0][0][1] = "Barang 2 Ruang 1 Lantai 1";
        barang[0][0][2] = "Barang 3 Ruang 1 Lantai 1";
        barang[0][0][3] = "Barang 4 Ruang 1 Lantai 1";

        barang[0][1][0] = "Barang 1 Ruang 2 Lantai 1";
        barang[0][1][1] = "Barang 2 Ruang 2 Lantai 1";
        barang[0][1][2] = "Barang 3 Ruang 2 Lantai 1";
        barang[0][1][3] = "Barang 4 Ruang 2 Lantai 1";

        barang[0][2][0] = "Barang 1 Ruang 3 Lantai 1";
        barang[0][2][1] = "Barang 2 Ruang 3 Lantai 1";
        barang[0][2][2] = "Barang 3 Ruang 3 Lantai 1";
        barang[0][2][3] = "Barang 4 Ruang 3 Lantai 1";

        barang[0][3][0] = "Barang 1 Toilet Lantai 1";
        barang[0][3][1] = "Barang 2 Toilet Lantai 1";
        barang[0][3][2] = "Barang 3 Toilet Lantai 1";
        barang[0][3][3] = "Barang 4 Toilet Lantai 1";

        barang[0][4][0] = "Barang 1 Mushola Lantai 1";
        barang[0][4][1] = "Barang 2 Mushola Lantai 1";
        barang[0][4][2] = "Barang 3 Mushola Lantai 1";
        barang[0][4][3] = "Barang 4 Mushola Lantai 1";

        // Mengisi data barang di dalam ruangan lantai 2
        barang[1][0][0] = "Barang 1 Ruang 1 Lantai 2";
        barang[1][0][1] = "Barang 2 Ruang 1 Lantai 2";
        barang[1][0][2] = "Barang 3 Ruang 1 Lantai 2";
        barang[1][0][3] = "Barang 4 Ruang 1 Lantai 2";
        
        barang[1][1][0] = "Barang 1 Ruang 2 Lantai 2";
        barang[1][1][1] = "Barang 2 Ruang 2 Lantai 2";
        barang[1][1][2] = "Barang 3 Ruang 2 Lantai 2";
        barang[1][1][3] = "Barang 4 Ruang 2 Lantai 2";

        barang[1][2][0] = "Barang 1 Ruang 3 Lantai 2";
        barang[1][2][1] = "Barang 2 Ruang 3 Lantai 2";
        barang[1][2][2] = "Barang 3 Ruang 3 Lantai 2";
        barang[1][2][3] = "Barang 4 Ruang 3 Lantai 2";

        barang[1][3][0] = "Barang 1 Toilet Lantai 2";
        barang[1][3][1] = "Barang 2 Toilet Lantai 2";
        barang[1][3][2] = "Barang 3 Toilet Lantai 2";
        barang[1][3][3] = "Barang 4 Toilet Lantai 2";
        
        barang[1][4][0] = "Barang 1 Mushola Lantai 2";
        barang[1][4][1] = "Barang 2 Mushola Lantai 2";
        barang[1][4][2] = "Barang 3 Mushola Lantai 2";
        barang[1][4][3] = "Barang 4 Mushola Lantai 2";
    }
}
