package task_4

import java.lang.StringBuilder

class Polindrom {
    companion object{
        fun isPolindrom(str: String): Boolean{
            val newStringBuilder = StringBuilder(str).reverse()
            return newStringBuilder.toString() == str
        }

        fun isPolindrom(int: Int): Boolean{
            return isPolindrom(int.toString())
        }
    }
}