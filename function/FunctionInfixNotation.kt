package function

infix fun String.to(type : String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){

    val result = "azmi" to "UP"
    println(result)

}