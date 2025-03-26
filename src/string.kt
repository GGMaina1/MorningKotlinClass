fun main() {
    var firstname = "Albert"
    var lastname = "Maina"
    var text = "Hello there"

    println(firstname)
    println(lastname)
    println(firstname+" "+lastname) //string concatenation
    //println(text.get(0))
    println(text[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println(text + " joe") // beginner
    println("My first name is $firstname") //legend
    println("My fullname is $firstname $lastname")



}