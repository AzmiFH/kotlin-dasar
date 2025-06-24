package perulangan

fun main() {
    val names = arrayOf("azmi ","fajarul ","haq")
    for (name in names){
        print(name)
    }

    for (i in 100 downTo 0 step 2){
        println(i)
    }


//latihan 1
    for (a in 0..10){
        println(a)
    }

    // latihan 2
    val daftarBuah = listOf("Apel", "Jeruk", "Mangga", "Anggur")
    for (buah in daftarBuah){
        println("aku suka makan buah "+buah)
    }

    //latihan3
    for (b in 0..20 step 2){
        println(b)
    }

    //latihan 4
    for (c in 5 downTo 1){
        println(c)
    }
    //latihan no 5 tidak bisa tolong berikan jawaban nya

}

