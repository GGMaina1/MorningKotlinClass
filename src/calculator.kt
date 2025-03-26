import java.util.Scanner

// first&second number and operator using when
fun main() {
    var read = Scanner(System.`in`)

    println("Input first number")
    var num1 = read.nextInt()

    println("Input operator sign")
    var operator = readln()

    println("Input second number")
    var num2 = read.nextInt()
    var comment = "The result is "

    var result = when(operator){
        "+" -> println(comment+(num1+num2))
        "-" -> println(comment+(num1-num2))
        "*" -> println(comment+(num1*num2))
        "/" -> println(comment+(num1/num2))
        else -> println("invalid operator sign")
    }
}