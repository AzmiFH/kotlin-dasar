package percabangan

fun main(){
/*
const val STOCK_MINIMUM = 10
fun main() {
    // Soal 1: Daftar Absensi Kelas (Fokus: For Loop & Indeks)
    // 1. Buat sebuah array `namaSiswa` yang berisi 4 nama.
    // 2. Gunakan `for loop` untuk menampilkan daftar absensi.
    //    Gunakan range `namaSiswa.indices` untuk mendapatkan nomor indeksnya.
    // 3. Cetak setiap nama dengan format nomor urut.
    //    Contoh Output:
    //    1. Budi
    //    2. Dewi
    //    3. Candra
    //    4. Fajar
    //    (TIPS: Nomor urut adalah `indeks + 1`)

    // TULIS KODE SOAL 1 DI SINI
    val namaSiswa : Array<String> = arrayOf("yayat","yuna","saba","baro")
    for (n in namaSiswa.indices){
        println("${n + 1}. nama siswa : ${namaSiswa[n]}.")
    }


    println("\n--- Batas Soal ---\n")


    // Soal 2: Simulasi Ganjil-Genap (Fokus: For Loop dengan `if` & `step`)
    // 1. Bayangkan hari ini adalah tanggal ganjil. Buat variabel `tanggal` bernilai 17.
    // 2. Gunakan `for loop` untuk mensimulasikan pengecekan plat nomor mobil dari 100 turun ke 80 (`100 downTo 80`).
    // 3. Di dalam loop, gunakan `if` untuk mengecek apakah nomor plat tersebut ganjil atau genap.
    // 4. Aturan: Karena tanggalnya ganjil, hanya mobil dengan plat ganjil yang boleh lewat.
    //    - JIKA nomor plat ganjil, cetak "[Nomor Plat] - Ganjil, Boleh Lewat".
    //    - JIKA nomor plat genap, cetak "[Nomor Plat] - Genap, Tidak Boleh Lewat".
    //    (TIPS: Gunakan operator sisa bagi `% 2` untuk cek ganjil/genap)

    // TULIS KODE SOAL 2 DI SINI
    var tanggal = 17
    for (i in 100 downTo 80 ){
        if (i % 2 != 0){
            println("$i, ganjil boleh lewat")

        }else{
            println("$i, genap tidak boleh lewat")
        }
    }


    println("\n--- Batas Soal ---\n")


    // Soal 3: Pengecekan Stok Gudang (Soal Gabungan)
    // 1. Di LUAR `main`, buat konstanta `STOK_MINIMUM` dengan nilai 10.
    // 2. Di DALAM `main`, buat DUA buah array:
    //    - `namaProduk` -> arrayOf("Buku Tulis", "Pensil 2B", "Penghapus")
    //    - `jumlahStok` -> arrayOf(15, 5, 0)
    //    (Pastikan urutan produk dan stoknya sesuai)
    // 3. Gunakan `for loop` untuk mengecek setiap item stok.
    // 4. Di dalam loop, gunakan `if-else if-else` untuk menentukan status stok:
    //    - JIKA stoknya 0, cetak "[Nama Produk] - STATUS: STOK HABIS!".
    //    - JIKA stoknya di bawah `STOK_MINIMUM`, cetak "[Nama Produk] - STATUS: KRITIS, sisa [Jumlah Stok]. Segera pesan lagi!".
    //    - SELAIN ITU, cetak "[Nama Produk] - STATUS: AMAN".

    // TULIS KODE SOAL 3 DI SINI
    val namaProduk : Array<String> = arrayOf("Buku Tulis", "Pensil 2B", "Penghapus")
    val jumlahStock = arrayOf(15,5,0)
    for (i in namaProduk.indices){
        var produk = namaProduk[i]
        var stok = jumlahStock[i]
        println(produk)
        println(stok)
    }

}

// TULIS DEKLARASI CONST VAL UNTUK SOAL 3 DI SINI
 */
}