package task_1

fun main(){
    val str:String = "www"
    println(isUpperCase(str))
}

fun isUpperCase(str: String) : Boolean{
    str.forEach {
        if (it.isUpperCase()) {
            return true
        }
    }
    return false
}

