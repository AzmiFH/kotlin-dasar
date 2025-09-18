fun cetakKartuNama(nama: String,kotaAsal : String){
    println("""
        --- KARTU NAMA ---
        Nama : $nama
        Asal : $kotaAsal
       --------------------
    """.trimIndent())
}
fun sapaPengguna(namaDepan : String,namaBelakang : String?){
    if (namaBelakang == null){
        println("halo $namaDepan")
    }else{
        println("hallo $namaDepan $namaBelakang")
    }
}
fun main() {
    // Soal 1: Membuat Kartu Nama (Fokus: Parameter Dasar)
    // 1. Buat sebuah function bernama `cetakKartuNama`.
    // 2. Function ini harus menerima dua parameter: `nama` (String) dan `kotaAsal` (String).
    // 3. Di dalam function, cetak informasi dengan format:
    //    "--- KARTU NAMA ---"
    //    "Nama : [nama]"
    //    "Asal : [kotaAsal]"
    //    "--------------------"
    // 4. Di dalam `fun main`, panggil function `cetakKartuNama` tersebut sebanyak DUA KALI
    //    dengan data nama dan kota yang berbeda.

    // TULIS KODE SOAL 1 DI SINI (Function-nya di luar main, panggilannya di dalam main)
    cetakKartuNama("rambo","garut")
    cetakKartuNama("rima","bandung")


    println("\n======================\n")


    // Soal 2: Menampilkan Nama Lengkap (Fokus: Nullable Parameter)
    // 1. Buat sebuah function bernama `sapaPengguna`.
    // 2. Function ini harus menerima dua parameter: `namaDepan` (String) dan `namaBelakang` (String?).
    //    Perhatikan bahwa nama belakang boleh null.
    // 3. Di dalam function, gunakan `if` untuk mengecek apakah `namaBelakang` itu null.
    //    - JIKA tidak null, cetak "Halo, [namaDepan] [namaBelakang]".
    //    - JIKA null, cetak "Halo, [namaDepan]".
    // 4. Di dalam `fun main`, panggil function `sapaPengguna` sebanyak DUA KALI:
    //    - Sekali dengan nama belakang yang diisi.
    //    - Sekali lagi dengan `null` sebagai nama belakang.

    // TULIS KODE SOAL 2 DI SINI (Function-nya di luar main, panggilannya di dalam main)
    sapaPengguna("yaro","mawan")
    sapaPengguna("yaro",null)


    println("\n======================\n")


    // Soal 3: Kalkulator Nilai Akhir (Soal Gabungan)
    // 1. Buat sebuah function bernama `hitungRataRata`.
    // 2. Function ini harus menerima satu parameter: `nilai` (berupa Array<Int>).
    // 3. Di dalam function:
    //    a. Gunakan `for loop` untuk menjumlahkan semua angka di dalam array `nilai`.
    //    b. Hitung nilai rata-ratanya (total jumlah / banyaknya nilai).
    //    c. Cetak nilai rata-ratanya.
    // 4. Di dalam `fun main`:
    //    a. Buat sebuah array `nilaiBudi` berisi beberapa angka (contoh: 80, 90, 100).
    //    b. Panggil function `hitungRataRata` dan masukkan `nilaiBudi` sebagai argumennya.
    //    c. Buat array `nilaiDewi` dan panggil lagi function-nya dengan data Dewi.

    // TULIS KODE SOAL 3 DI SINI (Function-nya di luar main, panggilannya di dalam main)
    val nilaiBudi : Array<Int> = arrayOf(80, 90, 100)
    val nilaiDewi = arrayOf(30,70,60)
    hitungRatarata(nilaiBudi)
    hitungRatarata(nilaiDewi)

}

// ---> Tempat terbaik untuk menulis function baru adalah di sini, di luar `fun main()` <---
fun hitungRatarata(nilai: Array<Int> ){
    var total = 0
    for (i in nilai){
        total += i
    }
    var rataRata = total/nilai.size
    println(rataRata)
}
