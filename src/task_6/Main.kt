package task_6

fun main(){
    var arr:Array<Int> = arrayOf(1, 8, 3, 5, 6)
    val result = arr.customSort {
        return@customSort it>2
    }
    for (el in result){
        println(el)
    }
}

fun Array<Int>.customSort(rules: (Int)-> Boolean): Array<Int>{
    var arr:Array<Int> = arrayOf()
    for (elem in this){
        if (rules(elem)){
            arr = arr.plus(elem)
        }
    }
    return arr
}