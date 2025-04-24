## Memulai

Ini merupakan aplikasi Java yang mengimplementasikan struktur data untuk mengelola informasi inventaris gedung.

## Struktur Folder

Workspace ini secara default berisi dua folder, yaitu:

- `src`: folder untuk menyimpan kode sumber
- `lib`: folder untuk menyimpan dependensi

Sementara itu, file output hasil kompilasi akan disimpan di folder `bin` secara default.

> Jika ingin menyesuaikan struktur folder, buka `.vscode/settings.json` dan perbarui pengaturan terkait di sana.

## Deskripsi Proyek

Ini merupakan aplikasi Java yang mengimplementasikan struktur data untuk mengelola informasi inventaris gedung. Aplikasi ini memungkinkan penyimpanan data tentang barang-barang yang terletak di berbagai ruangan di beberapa lantai gedung.

### Detail Implementasi

Dalam file `App.java`:

1. **Pernyataan Masalah**:

   - Membuat sistem untuk mengelola data inventaris gedung dengan 2 lantai.
   - Setiap lantai memiliki 5 ruangan (termasuk toilet dan mushola).
   - Setiap ruangan berisi 4 barang.

2. **Struktur Data**:

   - Menggunakan array multi-dimensi untuk merepresentasikan struktur gedung:
     - `String gedung`: Menyimpan nama gedung
     - `String[] lantai`: Array satu dimensi untuk informasi lantai
     - `String[][] ruangan`: Array dua dimensi untuk informasi ruangan (berdasarkan lantai)
     - `String[][][] barang`: Array tiga dimensi untuk informasi barang (berdasarkan lantai dan ruangan)

3. **Implementasi**:

   - Mengisi array dengan data sampel untuk semua lantai, ruangan, dan barang
   - Menyertakan komentar detail yang menjelaskan pilihan tipe data dan strukturnya

4. **Konsep Pembelajaran**:
   - Array multi-dimensi
   - Desain struktur data
   - Konvensi penamaan variabel
