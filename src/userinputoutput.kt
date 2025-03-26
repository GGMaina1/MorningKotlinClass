import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your first name :")
    var firstname = readln()
    println("I am  $firstname")

    println("Enter your age :")
    var age = read.nextInt()
    var mess = println("$firstname you are $age years old")

    println("Enter your weight")
    var weight = read.nextDouble()
    println("$firstname you are $age years old and a have weight of $weight Kgs")


}