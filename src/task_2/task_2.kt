package task_2

fun main(){
    val str:String = "www"
    println(sizeUpperCase(str))
}

fun sizeUpperCase(str: String) : Int{
    var i:Int = 0
    str.forEach {
        if (it.isUpperCase()) {
            i++
        }
    }
    return i
}

