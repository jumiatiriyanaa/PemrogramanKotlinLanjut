import java.lang.Exception

fun main() {
    try {
        val myVar: Int = 0
        val v:String = "Rekayasa Perangkat Lunak";
        v.toInt();
    } catch (e:Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handeling in Kotlin")
    }
}