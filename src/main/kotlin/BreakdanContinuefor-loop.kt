fun main() {
    println("Example of Break dan Continue Label")
    myLabel@ for (x in 1..10) {
        if(x == 5) {
            println("I am iside if block with value"+x+"\n-- hence it wil close the operation")
            break@myLabel
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("No Print")
    }
}
