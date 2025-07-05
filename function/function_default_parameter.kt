package function
fun nama(namasatu : String,namadua : String? = null){
    println()

}
fun main(){
    infoMakanan("Sate Ayam")
    infoMakanan("Sushi","Jepang")
}

//Tugas: Membuat Fungsi Info Makanan
fun infoMakanan(namaMakanan :String,asalNegara :String = "Indonesia"){
    println("$namaMakanan adalah makanan khas dari $asalNegara")

}