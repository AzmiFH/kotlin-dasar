fun main(){
val member : Array<String> = arrayOf("azmi","fathan")
    //mendaoatkan index array
    val nama1 : String = member[0]
    val nama2 : String = member.get(1)

    //merubah isi array member.set(0,"azmi')
    //print("$nama1 $nama2")

    //array null array tidak boleh null

    //cara array null
    val buah : Array<String?> = arrayOfNulls(5)
    buah[0] = "mangga"
    buah[1] = "pisang"
    buah[2] = "anggur"

    print(buah[1])
}

/*
## Array di Kotlin
Analogi: Rak Telur 🥚 atau Lemari Laci Bernomor.

Definisi: Satu wadah untuk menyimpan banyak data sejenis.

Aturan Penting:

Isi Harus Sejenis: String semua atau Int semua.

Ukuran Tetap: Tidak bisa ditambah atau dikurangi.

## Kode & Istilah Kunci
Membuat: val nama = arrayOf("A", "B", "C")

Indeks: "Nomor Laci". Selalu mulai dari 0.

nama[0] → Mengambil "A".

nama[2] → Mengambil "C".

.size: Ukuran atau jumlah isi array.

val pada Array: Isinya ("A") bisa diubah, tapi variabel nama tidak bisa menunjuk ke array baru.

Array Boleh Kosong (null):

Tanda: Pakai tanda tanya (?), contoh: Array<String?>.

Membuat: Pakai arrayOfNulls(jumlah_laci).
latihan
const val NAMA_SEKOLAH = "SEKOLAH_KUCING"
fun main() {
    // Soal 1: Daftar Belanja (Fokus: Membuat & Mengubah Array)
    // 1. Buat sebuah array bernama `daftarBelanja` menggunakan `val`.
    //    Isi array tersebut dengan tiga item belanjaan (String): "Apel", "Sabun", "Roti".
    // 2. Cetak ke konsol item belanjaan pertama (indeks ke-0).
    // 3. Ternyata Anda salah tulis, ganti item kedua ("Sabun") menjadi "Shampo".
    // 4. Cetak ke konsol item belanjaan kedua setelah diubah untuk memastikan sudah benar.

    // TULIS KODE SOAL 1 DI SINI

    val daftarBelanja : Array<String> = arrayOf("Apel","Sabun","Roti")
    daftarBelanja.set(1,"Shampo")


    println("\n${daftarBelanja[0]}\n")


    // Soal 2: Jadwal Piket (Fokus: Nullable Array & Properti .size)
    // 1. Bayangkan ada 5 hari kerja (Senin-Jumat). Buatlah sebuah array nullable
    //    bernama `jadwalPiket` dengan ukuran 5 untuk menampung nama-nama (String)
    //    yang piket, karena mungkin ada hari yang kosong. Gunakan `arrayOfNulls()`.
    // 2. Isi jadwal untuk hari Senin (indeks 0) dengan nama "Budi" dan
    //    hari Jumat (indeks 4) dengan nama "Dewi".
    // 3. Cetak jumlah hari kerja menggunakan properti `.size` dari array tersebut.
    // 4. Cetak nama yang piket di hari Jumat.

    // TULIS KODE SOAL 2 DI SINI

    val jadwalPiket : Array<String?> = arrayOfNulls<String?>(5)
    jadwalPiket[0] = "Budi"
    jadwalPiket[1] = "Selasa"
    jadwalPiket[2] = "Rabu"
    jadwalPiket[3] = "Kamis"
    jadwalPiket[4] = "Dewi"
    var jumlah = jadwalPiket.size

    println("\njumlah hari kerja : $jumlah\n")
    println("\nnama piket hari jumat : ${jadwalPiket[4]}\n")


    // Soal 3: Kartu Ucapan Kelulusan (Soal Gabungan)
    // 1. Di LUAR fungsi main, buat sebuah konstanta `NAMA_SEKOLAH` berisi nama sekolah fiktif.
    // 2. Di DALAM fungsi main, buat sebuah array `namaLulusan` berisi 3 nama teman Anda.
    // 3. Buat variabel `tahunAngkatan` berisi tahun kelulusan (misal: 2024).
    // 4. Cetak kartu ucapan untuk setiap lulusan dengan format:
    //    "Selamat kepada [Nama], angkatan 2024 dari [Nama Sekolah]!"
    //    Gunakan String Template untuk formatnya.
    //    (TIPS: Cetak satu per satu untuk setiap nama di dalam array menggunakan indeksnya).

    // TULIS KODE SOAL 3 DI SINI
    val namaLulusan : Array<String> = arrayOf("sumbul","ranggo","kara")
    var tahunAngkatan = 2024

    println("Selamat kepada ${namaLulusan[0]}, angkatan $tahunAngkatan dari $NAMA_SEKOLAH!")
    println("Selamat kepada ${namaLulusan[1]}, angkatan $tahunAngkatan dari $NAMA_SEKOLAH!")
    println("Selamat kepada ${namaLulusan[2]}, angkatan $tahunAngkatan dari $NAMA_SEKOLAH!")


}

// TULIS DEKLARASI CONST VAL UNTUK SOAL 3 DI SINI

 */