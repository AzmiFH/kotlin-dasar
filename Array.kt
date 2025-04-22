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