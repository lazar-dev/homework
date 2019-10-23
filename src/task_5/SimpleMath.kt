package task_5

import com.sun.org.apache.xml.internal.serialize.IndentPrinter
import java.lang.Math.pow
import kotlin.math.pow

class SimpleMath(var hashMap: HashMap<String, Double>) {
    fun math(): Double{
        val x : Double = this.hashMap.get("x")!!
        val y : Double = this.hashMap.get("y")!!


        val z: Double = x.pow(2)*(y - 8)/5 - (2*x + 5)/y
        return z
    }
}