fun main() {
    // Soal 1: Mencari Pemenang Undian (Fokus: break)
    // 1. Buat sebuah array `nomorUndian` berisi 10 nomor acak (Int) antara 1 dan 100.
    // 2. Buat sebuah `val` bernama `nomorPemenang` dengan nilai 77.
    // 3. Gunakan `for loop` untuk mencari `nomorPemenang` di dalam array `nomorUndian`.
    // 4. Di dalam loop, cetak setiap nomor yang sedang dicek.
    // 5. JIKA `nomorPemenang` ditemukan:
    //    a. Cetak pesan "Pemenang ditemukan!".
    //    b. Gunakan `break` untuk menghentikan pencarian.
    val nomorUndian : Array<Int> = arrayOf(1,34,12,77,76,43,23,78,89,54)
    var nomerPemenang = 77
    for (i in nomorUndian){
        if (i == nomerPemenang){
            println("pemenang ditemukan")
            break
        }else{
            println("pemenang belum ditemukan")
        }
    }

    // TULIS KODE SOAL 1 DI SINI


    println("\n--- Batas Soal ---\n")


    // Soal 2: Menghitung Jam Lembur (Fokus: continue)
    // 1. Buat sebuah array `catatanJamKerja` berisi jam kerja harian selama seminggu (Int).
    //    Isi dengan data: arrayOf(8, 9, 7, 0, -1, 10, 8). Angka 0 adalah hari libur, -1 adalah data error.
    // 2. Buat sebuah `var totalJamLembur` dengan nilai awal 0. Jam kerja normal adalah 8 jam.
    // 3. Gunakan `for loop` untuk mengiterasi `catatanJamKerja`.
    // 4. Di dalam loop:
    //    a. JIKA jam kerja hari itu 8 jam atau kurang (termasuk 0 dan -1), gunakan `continue`
    //       untuk melewati hari itu dan lanjut ke hari berikutnya.
    //    b. SELAIN ITU (jika lebih dari 8), hitung jam lemburnya (jamKerja - 8) dan
    //       tambahkan ke `totalJamLembur`.
    // 5. Setelah loop selesai, cetak total jam lembur selama seminggu.

    // TULIS KODE SOAL 2 DI SINI
    val catatanJamKerja = arrayOf(8, 9, 7, 0, -1, 10, 8)
    var totalJamLembur = 0
    var jamkerja = 8
    for (n in catatanJamKerja)
        if (jamkerja <= n){
            println("hari berikut nya")
        }else if (jamkerja >= n){
            var lembur = jamkerja - 8
            totalJamLembur += lembur
            println(totalJamLembur)
        }


    println("\n--- Batas Soal ---\n")


    // Soal 3: Simulasi Game (Soal Gabungan)
    // 1. Buat array `levelLayout` yang merepresentasikan sebuah level game:
    //    arrayOf("HARTA", "MUSUH", "HARTA", "HARTA", "TEMBOK", "HARTA")
    // 2. Buat variabel `skor` (Int, awal 0) dan `nyawa` (Int, awal 3).
    // 3. Gunakan `for loop` untuk "berjalan" di setiap elemen `levelLayout`.
    // 4. Di dalam loop, gunakan `when` expression:
    //    - Jika elemennya "HARTA": tambah `skor` sebanyak 10.
    //    - Jika elemennya "MUSUH": kurangi `nyawa` sebanyak 1 dan cetak "Terkena musuh! Sisa nyawa: [nyawa]".
    //    - Jika elemennya "TEMBOK": cetak "Jalan buntu! Petualangan berhenti." lalu gunakan `break`.
    // 5. Di dalam loop, setelah `when`, tambahkan `if` untuk mengecek jika `nyawa` mencapai 0.
    //    Jika ya, cetak "Nyawa habis! Game Over." dan gunakan `break`.
    // 6. Tepat sebelum `if` pengecekan nyawa, jika elemennya adalah "MUSUH", gunakan `continue`
    //    agar skor tidak bertambah setelah terkena musuh. (Ini adalah jebakan logika kecil!)
    // 7. Setelah loop selesai, cetak skor akhir.

    // TULIS KODE SOAL 3 DI SINI
    val levelLayout = arrayOf("HARTA", "MUSUH", "HARTA", "HARTA", "TEMBOK", "HARTA")
    var skor = 0
    var nyawa = 3
    for (sa in levelLayout){
        when (sa){
            "Harta" -> skor += 10
            "MUSUH" -> nyawa -= 1
            "TEMBOK" -> println("Jalan buntu! Petualangan berhenti.")

        }

        if (nyawa == 0){
            println("Nyawa habis! Game Over.")
            break
        }
        println(skor)

    }

}