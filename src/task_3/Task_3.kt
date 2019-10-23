package task_3

import java.lang.StringBuilder

fun main() {
    val str: String = "PRIVET"
    println(reverseCaseString(str))
}

fun reverseCaseString(str: String): String {
    var newStr: StringBuilder = StringBuilder("")
    str.forEach {
        if (it.isUpperCase()) {
            newStr.append(it.toLowerCase())
        }else{
            newStr.append(it.toUpperCase())
        }
    }
    return newStr.toString()
}