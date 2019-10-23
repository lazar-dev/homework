package task_5

fun main(){
    val hashMap : HashMap<String, Double> = HashMap()
    hashMap.put("x", 5.0)
    hashMap.put("y", 2.0)
    val simpleMath : SimpleMath = SimpleMath(hashMap)
    println(simpleMath.math())
}