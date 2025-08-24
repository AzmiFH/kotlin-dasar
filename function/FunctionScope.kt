package function


fun satu(){
    // error
    // contohHelloWorld()
}

fun dua(){
    // error
    // contohHelloWorld()
}

fun main() {
    fun contohHelloWorld(){
        println("Hello World")
    }
    // Memanggil fungsi `ucapSalam` yang ada di global scope.
    // Panggilan ini VALID karena `ucapSalam` bisa diakses dari mana saja.
    println("Memanggil fungsi dari Global Scope:")
    ucapSalam()

    contohHelloWorld()
}

/**
 * =================================================================
 * CONTOH FUNGSI DENGAN GLOBAL SCOPE
 * =================================================================
 * Fungsi ini dideklarasikan di "level atas" file, sejajar dengan fungsi main.
 * Artinya, fungsi `ucapSalam` ini memiliki cakupan global.
 *
 * Keuntungannya:
 * - Bisa dipanggil dari fungsi `main`.
 * - Bisa dipanggil dari file Kotlin lain di dalam package yang sama.
 *
 * Ini berguna untuk membuat fungsi utilitas atau helper yang sering digunakan
 * di banyak tempat.
 */
fun ucapSalam() {
    println("Assalamualaikum, Programmer!")
}
//fun main() {
    /**
     * =================================================================
     * CONTOH FUNGSI DENGAN LOCAL SCOPE (INNER FUNCTION)
     * =================================================================
     * Fungsi `balasSalam` ini dideklarasikan DI DALAM fungsi `main`.
     * Artinya, fungsi ini memiliki cakupan lokal (local scope).
     *
     * Keuntungannya:
     * - Hanya bisa diakses dari dalam fungsi `main`. Tidak bisa dipanggil dari luar.
     * - Menjaga kode tetap rapi dan terorganisir.
     * - Menghindari "polusi nama" atau konflik jika ada fungsi dengan nama yang sama
     * di file atau bagian kode lain.
     *
     * Ini sangat berguna untuk fungsi bantuan kecil yang tugasnya sangat spesifik
     * dan hanya relevan untuk fungsi `main`.
     */
    fun balasSalam() {
        println("Wa'alaikumsalam, semangat ngoding!")
    }

    // Memanggil fungsi `balasSalam` yang ada di local scope.
    // Panggilan ini VALID karena kita memanggilnya dari dalam `main`.
   // println("Memanggil fungsi dari Local Scope:")
  //  balasSalam()

// Jika kamu mencoba memanggil balasSalam() dari sini, akan terjadi ERROR.
// balasSalam() // <-- Baris ini akan menyebabkan error "Unresolved reference: balasSalam"