fun main() {
    val numbers = mutableListOf(1, 2, 3 ,4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numversStr = mutableListOf("one", "two", "three", "four")
    numversStr.add("five")
    println(numversStr)
}