fun main() {
    println("Example of Break and Continue Label")
    myLabel@ for(x in 1..18){
        if(x == 5){
            println("I am inside o=if block with value"+x+"\n--hence it will close the operation")
            break@myLabel
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}