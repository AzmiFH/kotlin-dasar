package function
fun main(){
    fun hello(name : String,trans : (String) -> String) : String {
        val nameTrans = trans(name)
        return "hello $nameTrans"
    }
    val lambdaUpper ={value : String -> value.toUpperCase()}
    println(hello("azmi",lambdaUpper))
}




