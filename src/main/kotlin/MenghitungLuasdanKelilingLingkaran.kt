import kotlin.math.PI

fun main() {
    //Advanced exercie
    print("Enter the circle's radie (cm): ")
    val radius = readLine()!!.toDouble()
    var circumference = 2 * PI * radius
    var area = PI * radius * radius
    println("The circle's circumference bases on the given radius is: " + circumference + " cm")
    println("Area of the circle is: " + area + " cm^2")

}