package function

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total;
}

fun main() {
    // val values = arrayOf(10,10,10,10)
    val result = hitungTotal("Eko", 10, 10, 10)

    println(result)
}
/*
fun cetakHobi(nama: String,vararg hobi : String): String{
    var hasil = "nama : $nama\n"
    for (hobli in hobi){
        hasil += "$hobli"
    }
    return hasil
}

fun kaliSemua(vararg angka : Int):Int{
    var nilai = 1
    for(angkla in angka){
        nilai *= angkla
    }
    return nilai
}
fun gabungNama(nama :String,vararg hurufKapital :Boolean): String {
    if (hurufKapital == true) {
        var hasil = nama.uppercase()
        for (w in nama) {
            if (nama.isNotEmpty())
                continue
        }
    }
}

fun main() {
    // Soal 1: Daftar Hobi (Fokus: vararg dengan String)
    // 1. Buat sebuah function bernama `cetakHobi`.
    // 2. Function ini harus menerima dua parameter: `nama` (String) dan `vararg hobi` (String).
    // 3. Di dalam function, cetak nama orang tersebut.
    // 4. Setelah itu, gunakan `for loop` untuk mencetak semua hobi yang dimasukkan,
    //    satu per satu dengan format "- [hobi]".
    // 5. Di dalam `fun main`, panggil function `cetakHobi` sebanyak DUA KALI:
    //    - Sekali dengan 2 hobi.
    //    - Sekali lagi dengan 4 hobi.

    // TULIS KODE SOAL 1 DI SINI (Function-nya di luar main, panggilannya di dalam main)
    println(cetakHobi("rambo"," memanah"," berenang"))
    val output = cetakHobi("Andi", "Membaca", " Sepak Bola"," basket"," lari")
    println(output)


    println("\n======================\n")


    // Soal 2: Kalkulator Perkalian (Fokus: vararg dengan Int & Return Value)
    // 1. Buat sebuah function bernama `kaliSemua`.
    // 2. Function ini harus menerima satu parameter: `vararg angka` (Int).
    // 3. Function ini harus MENGEMBALIKAN (return) hasil perkalian semua angka tersebut (tipe Int).
    //    (TIPS: Mulai dengan `var hasil = 1`. Di dalam loop, kalikan `hasil` dengan setiap angka).
    // 4. Jika tidak ada angka yang dimasukkan (vararg kosong), function harus mengembalikan nilai 0.
    // 5. Di dalam `fun main`, panggil function `kaliSemua` dan cetak hasilnya:
    //    - Sekali dengan angka 2, 3, 4.
    //    - Sekali lagi dengan angka 5, 10.

    // TULIS KODE SOAL 2 DI SINI (Function-nya di luar main, panggilannya di dalam main)
    println(kaliSemua(2,3,4))
    var hasil = kaliSemua(5,10)
    println("total perkalia : $hasil")


    println("\n======================\n")


    // Soal 3: Gabung Nama (Soal Gabungan)
    // 1. Buat sebuah function bernama `gabungNama`.
    // 2. Function ini harus menerima dua parameter:
    //    - `vararg nama` (String)
    //    - `hurufKapital` (Boolean, dengan nilai default `true`)
    // 3. Function ini harus MENGEMBALIKAN (return) satu String berisi semua nama yang digabung,
    //    dipisahkan oleh spasi.
    // 4. Di dalam function:
    //    a. Gunakan `if` untuk mengecek `hurufKapital`. Jika `true`, ubah setiap nama menjadi huruf besar.
    //    b. Di dalam loop, lewati (`continue`) jika ada nama yang kosong atau hanya berisi spasi.
    // 5. Di dalam `fun main`, panggil function `gabungNama` DUA KALI dan cetak hasilnya:
    //    - Sekali dengan 3 nama (biarkan `hurufKapital` default).
    //    - Sekali lagi dengan 4 nama (termasuk satu nama kosong) dan set `hurufKapital` menjadi `false`.

    // TULIS KODE SOAL 3 DI SINI (Function-nya di luar main, panggilannya di dalam main)

}

// ---> Tempat terbaik untuk menulis function baru adalah di sini, di luar `fun main()` <---
 */