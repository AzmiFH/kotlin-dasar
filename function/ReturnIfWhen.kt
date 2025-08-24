package function

fun main(){

    fun hello(name : String = "") : String{
        return if (name == ""){
            "hello brown"
        } else {
            "hello $name"
        }
    }

    println(hello())
    println(hello("miaww"))
}

/**
 * =================================================================
 * CARA LAMA: Statement If dengan Return di Dalamnya
 * =================================================================
 * Ini adalah pendekatan tradisional yang umum di banyak bahasa pemrograman.
 *
 * Ciri-cirinya:
 * - Keyword `return` ditulis BERULANG KALI di dalam setiap blok kondisi (`if` dan `else`).
 * - `if` di sini berperan sebagai "statement" atau pernyataan untuk mengontrol alur program.
 *
 * Kekurangannya:
 * - Terjadi pengulangan (redundancy) kode, yaitu `return`.
 * - Kurang ringkas jika kondisinya semakin banyak.
 */
fun sayHelloCaraLama(name: String): String {
    if (name.isBlank()) {
        // Return nilai jika kondisi 'name' kosong terpenuhi.
        return "Hello Bro"
    } else {
        // Return nilai jika kondisi 'else' terpenuhi.
        return "Hello $name"
    }
}

/**
 * =================================================================
 * CARA BARU: Menggunakan 'if' sebagai Expression
 * =================================================================
 * Di Kotlin, `if` bisa bertindak sebagai "expression", yang artinya
 * `if` itu sendiri bisa menghasilkan dan mengembalikan sebuah nilai.
 *
 * Ciri-cirinya:
 * - Keyword `return` hanya ditulis SATU KALI di awal.
 * - Blok `if` atau `else` akan "menghasilkan" sebuah nilai (nilai dari baris terakhir di dalam blok).
 * - Nilai yang dihasilkan inilah yang kemudian dikembalikan (return) oleh fungsi.
 *
 * Keuntungannya:
 * - Kode jauh lebih ringkas dan bersih.
 * - Mengurangi pengulangan (redundancy).
 * - Lebih mudah dibaca karena niatnya jelas: "kembalikan hasil dari kondisi if ini".
 */
fun sayHelloCaraBaru(name: String): String {
    // `return` hasil dari expression `if` berikut ini.
    return if (name.isBlank()) {
        // Jika nama kosong, expression `if` ini akan menghasilkan nilai "Hello Bro".
        "Hello Bro"
    } else {
        // Jika tidak, expression `if` ini akan menghasilkan nilai "Hello $name".
        "Hello $name"
    }
}

/**
 * =================================================================
 * CARA BARU: Menggunakan 'when' sebagai Expression
 * =================================================================
 * Sama seperti `if`, `when` di Kotlin juga sebuah expression yang bisa
 * langsung menghasilkan nilai.
 *
 * Ciri-cirinya:
 * - `return` hanya ditulis SATU KALI di awal.
 * - Setiap cabang kondisi (`->`) akan menghasilkan nilai di sebelah kanannya.
 * - Nilai dari cabang yang cocok itulah yang akan dikembalikan (return) oleh fungsi.
 *
 * Keuntungannya:
 * - Alternatif yang sangat bersih dan mudah dibaca untuk menggantikan
 * struktur `if-else if-else` yang panjang dan bercabang.
 * - Niat kode menjadi sangat jelas.
 */
fun sayHelloDenganWhen(name: String): String {
    // `return` hasil dari expression `when` berikut ini.
    return when {
        // Jika `name.isBlank()` bernilai true, expression `when` akan menghasilkan "Hello Bro".
        name.isBlank() -> "Hello Bro"
        // Jika kondisi di atas tidak terpenuhi, `else` akan dieksekusi,
        // dan expression `when` akan menghasilkan "Hello $name".
        else -> "Hello $name"
    }
}