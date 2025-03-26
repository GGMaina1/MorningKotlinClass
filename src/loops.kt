fun main() {
//    //While loop
//    var num = 20
//    while (num <= 25){
//        println("Number : $num")
//        num += 1
//
//    }
//
//    // Do while
//    var count = 1
//    do {
//        println("Count is $count")
//        count ++
//    }while (count <= 5)

//    //For loop
//    for (num in 105..110){
//        println("Num is $num")
//    }
//    for (letter in 'a'..'z'){
//        print(letter)
//    }

    //Break statement
    for (x in 10..15){
        if (x == 12){
            break
        }
        println("number is $x")
    }
    // continue statement it skips
    for (myletter in 'a'..'d'){
        if (myletter == 'b'){
            continue
        }
        println("my letter is $myletter")
    }

}