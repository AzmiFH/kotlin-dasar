package function

fun main(){
    hitungLuasPersegiPanjang(10,5)
    hitungLuasPersegiPanjang(20,6)

}

fun sayHello(nama : String){
    println("hai $nama")
}

fun hitungLuasPersegiPanjang(panjang : Int,lebar : Int){
    val hasil = panjang * lebar
    println("hasill dari hitung luas persegi panjang $panjang dan $lebar adalah : $hasil")
}