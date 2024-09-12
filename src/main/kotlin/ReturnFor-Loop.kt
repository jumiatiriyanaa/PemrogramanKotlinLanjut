fun main(args: Array<String>) {
    returnLoop()

}
fun returnLoo(){
    var x:Int
    println("Example of return in for-Loop")
    for (x in 1..10) {
        if (x < 5) {
            print("${x - 1}")
        } else {
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")
}