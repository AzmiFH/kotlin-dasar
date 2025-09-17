package perulangan

fun main() {

    var i = 0

    while (i < 10){
        println("perulangan $i")
        i++
    }
    println("perulangan selesai")

    //latihan
    var hitungMundur = 10
    while (hitungMundur > 0){
        println("hitung mundur : $hitungMundur")
        hitungMundur--
    }
    println("GO! Roket Meluncur!")
}
/*
import kotlin.random.Random // Tambahkan ini di baris paling atas untuk Soal 3


fun main() {
    // Soal 1: Peluncuran Roket (Fokus: while)
    // 1. Buat sebuah variabel `hitunganMundur` dengan nilai awal 10.
    // 2. Gunakan `while` loop untuk melakukan hitung mundur.
    //    Perulangan harus terus berjalan SELAMA `hitunganMundur` masih lebih besar dari 0.
    // 3. Di dalam loop, cetak nilai `hitunganMundur` saat ini.
    // 4. Jangan lupa, kurangi nilai `hitunganMundur` sebanyak 1 di setiap putaran.
    // 5. Setelah loop selesai, cetak "GO!".

    // TULIS KODE SOAL 1 DI SINI
    var hitungMundur = 10
    while (hitungMundur > 0){
        println("hitung mundur saat ini $hitungMundur")
        hitungMundur--
    }
    println("GO!")



    println("\n--- Batas Soal ---\n")


    // Soal 2: Mesin Minuman (Fokus: do-while)
    // 1. Buat sebuah `do-while` loop untuk simulasi mesin minuman.
    // 2. Di dalam blok `do`, tampilkan menu sederhana:
    //    "Menu: 1. Kopi, 2. Teh, 3. Keluar"
    // 3. Buat variabel `pilihanPengguna` untuk menampung pilihan (kita simulasikan saja,
    //    tidak perlu input sungguhan).
    // 4. Gunakan `when` expression untuk mencetak respons berdasarkan `pilihanPengguna`.
    //    - Jika 1: "Anda memilih Kopi."
    //    - Jika 2: "Anda memilih Teh."
    //    - Jika 3: "Terima kasih!"
    // 5. Loop harus terus berjalan SELAMA `pilihanPengguna` tidak sama dengan 3.
    //    (TIPS: Untuk menguji, Anda harus mengubah-ubah nilai `pilihanPengguna` secara manual
    //     di dalam loop agar tidak terjadi infinite loop).

    // TULIS KODE SOAL 2 DI SINI



    println("\n--- Batas Soal ---\n")


    // Soal 3: Petualangan Mengumpulkan Harta (Soal Gabungan)
    // 1. Buat dua buah variabel: `energi` (Int, nilai awal 50) dan `totalHarta` (Int, nilai awal 0).
    // 2. Buat `while` loop yang akan terus berjalan SELAMA `energi` lebih besar dari 0.
    //    Ini adalah ronde petualangan.
    // 3. Di setiap awal ronde (di dalam `while`), kurangi `energi` sebanyak 15.
    // 4. Di dalam `while` tersebut, buat sebuah `for` loop yang berjalan 5 kali (1..5).
    //    Ini mensimulasikan Anda menemukan 5 peti harta di setiap ronde.
    // 5. Di dalam `for` loop, tambahkan nilai acak antara 10 sampai 50 ke `totalHarta`.
    //    Gunakan kode: `Random.nextInt(10, 51)`.
    // 6. Setelah `for` loop selesai, cetak status ronde: "Ronde selesai. Sisa energi: [energi], Total harta: [totalHarta]".
    // 7. Setelah `while` loop selesai (energi habis), cetak "Petualangan berakhir! Harta yang terkumpul: [totalHarta]".

    // TULIS KODE SOAL 3 DI SINI
    var energi = 50
    var totalHarta = 0
    while (energi > 0){
        energi -=  15
        for (i in 1..5){
            var harta = Random.nextInt(10,51)
            totalHarta += harta

        }
        println("Ronde selesai. Sisa energi: $energi, Total harta: $totalHarta")

    }
    println("Petualangan berakhir! Harta yang terkumpul: $totalHarta")

}
 */

