fun main() {
    //Arithmetic operators
    var a = 10
    var b = 5

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    //comparison operators
    var x = 89
    var y = 100

    println(x < y)
    println(x > y)
    println(x <= y)
    println(x >= y)
    println(x == y)
    println(x != y)

    //assignment operators
    var number = 26
    println(number)

            //adittion assinment
    number  += 2
    println(number)

    //operator precedence
    var result = 5 + 10*2 -3
    println("Result is $result")

    //logical operators   __ &&, is and    __ ||, is or     __ !, is not
    var num = 56
    println(num > 100 && num< 80 )
    println(num > 100 || num< 80 )
    println(!(num > 100 || num< 80 ))


}