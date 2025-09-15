fun main(){
 //satu baris //
    var nama = "azmi "
    var nama2 = "fajarul"
    //lebih dari satu baris//
    var alamat = """
        jawabarat,miawww
        ciamis
        indonesia
    """.trimMargin()//menggabungkan untuk satu line

    //menggabungkan string dengan operator plus

    var fullname = nama+""+nama2

    // Tugas 1: Kartu Pelajar Digital
    // Buat variabel-variabel berikut menggunakan `val`:
    // - namaLengkap (String)
    // - umur (Int)
    // - kotaAsal (String)
    // - statusMahasiswa (Boolean, isi dengan `true`)
    //
    // Cetak semua informasi tersebut ke konsol dalam satu kalimat perkenalan
    // yang rapi menggunakan String Template.
    // Contoh output: "Halo, nama saya Budi Sudarsono, umur 20 tahun dari Tasikmalaya. Status mahasiswa: true"

    // TULIS KODE TUGAS 1 DI SINI
    var namaLengkap = "rambo sudarsono"
    var umur = 22
    var kotaAsal = "Bekasi"
    var statuMahasiswa = true


    println("Halo, nama saya $namaLengkap $umur\n")



    //string template dengan tanda dollar
    //println("$nama$nama2 haq")
/*Tentu, ini dia catatan ringkasnya.

## String Biasa
Tanda: Petik dua (" ").

Ingat: Untuk teks satu baris.

## Multiline String
Tanda: Petik dua tiga kali (""" """).

Ingat: Untuk teks banyak baris (seperti alamat atau puisi).

## Escaped String
Tanda: Backslash (\).

Ingat: "Sinyal khusus" sebelum karakter spesial.

\n → new line (baris baru).

\t → tab.

\" → cetak tanda ".

\\ → cetak tanda ****.

## String Template
Tanda: Dolar ($).

Ingat: Cara menyisipkan variabel ke dalam teks.

$nama → untuk variabel biasa.

${ ekspresi } → untuk operasi/ekspresi yang lebih rumit.

## trimIndent()
Kata Kunci: Indentasi.

Ingat: Merapikan spasi secara otomatis dan "pintar".

## trimMargin()
Kata Kunci: Margin (Batas).

Ingat: Merapikan spasi secara manual dengan penanda |*/

}