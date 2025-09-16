fun main() {
    // Soal 1: Cek Kelulusan (Fokus: if-else sederhana)
    // 1. Buat sebuah variabel `nilaiUjian` dengan tipe data Int dan beri nilai 80.
    // 2. Buat sebuah if-else expression:
    //    - JIKA `nilaiUjian` lebih besar dari 75, cetak "Selamat, Anda Lulus!".
    //    - SELAIN ITU, cetak "Maaf, Anda harus coba lagi tahun depan.".
    // 3. Coba ubah-ubah nilai `nilaiUjian` (misal jadi 60) dan jalankan lagi untuk melihat hasilnya.

    // TULIS KODE SOAL 1 DI SINI
    var  nilaiUjian1 = 80
    if(nilaiUjian1 > 75){
        println("Selamat,anda Lulus")
    }else{
        println("Maaf,anda harus mencoba lagi tahun depan")
    }
    var nilaiUJian2 = 60
    if(nilaiUJian2 > 75){
        println("Selamat,anda Lulus")
    }else{
        println("Maaf,anda harus mencoba lagi tahun depan")
    }


    println("\n--- Batas Soal ---\n")


    // Soal 2: Kategori SIM (Fokus: if-else if-else)
    // Di Indonesia, ada beberapa kategori SIM berdasarkan usia:
    // - SIM A/C: minimal 17 tahun
    // - SIM B1: minimal 20 tahun
    // - SIM B2: minimal 21 tahun
    //
    // 1. Buat sebuah variabel `usia` dengan tipe data Int dan beri nilai 19.
    // 2. Buat if-else if-else expression untuk menentukan SIM yang bisa dibuat:
    //    - JIKA `usia` lebih besar atau sama dengan 21, cetak "Anda bisa membuat SIM A/C, B1, dan B2.".
    //    - JIKA `usia` lebih besar atau sama dengan 20, cetak "Anda bisa membuat SIM A/C dan B1.".
    //    - JIKA `usia` lebih besar atau sama dengan 17, cetak "Anda hanya bisa membuat SIM A/C.".
    //    - SELAIN ITU, cetak "Maaf, Anda belum cukup umur untuk membuat SIM.".

    // TULIS KODE SOAL 2 DI SINI
    var usia = 19
    if (usia >= 21){
        println("Anda bisa membuat SIM A/C, B1, dan B2.")
    }else if (usia >= 20) {
        println("Anda bisa membuat SIM A/C dan B1.")
    }else if (usia >= 17){
        println("Anda hanya bisa membuat SIM A/C.")
    }else {
        println("Maaf, Anda belum cukup umur untuk membuat SIM.")
    }


    println("\n--- Batas Soal ---\n")


    // Soal 3: Simulasi Diskon Belanja (Soal Gabungan)
    // 1. Buat sebuah array `daftarBelanjaan` berisi 3 harga barang (Int), contoh: arrayOf(50000, 120000, 85000).
    // 2. Hitung total belanja dari semua barang di array tersebut menggunakan operator matematika.
    // 3. Buat sebuah variabel `adalahMember` dengan tipe Boolean, set nilainya ke `true`.
    // 4. Buat logika if-else:
    //    - JIKA `adalahMember` bernilai `true` DAN `totalBelanja` lebih dari 100000,
    //      maka berikan diskon 20000. Cetak total belanja awal dan total setelah diskon.
    //    - SELAIN ITU, tidak ada diskon. Cetak hanya total belanja awal.
    //    Gunakan String Template untuk mencetak output yang informatif.

    // TULIS KODE SOAL 3 DI SINI

    val daftarbelanjaan : Array<Int> = arrayOf(50000,12000,85000)
    var totalBelanja = daftarbelanjaan.sum()
    val adalahMember = true
    if (adalahMember == true && totalBelanja > 100000){
        println(" total belanja awal : $totalBelanja , total diskon : ${totalBelanja - 20000} ")

    }else{
        println("total belanja awal : $totalBelanja")
    }

}