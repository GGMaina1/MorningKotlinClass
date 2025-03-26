import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    println("Input first number")
    var num1 = read.nextInt()

    println("Input second number")
    var num2 = read.nextInt()

    println("Input third number")
    var num3 = read.nextInt()

    if (num1>num2 && num1>num3){
        println("The largest number is $num1")
    }
    else if (num2>num3){
        println("The largest number is $num2")
    }
    else{
        println("The largest number is $num3")
    }
}