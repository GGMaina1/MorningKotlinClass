open class Animal{   //parent/base/super class
    var age = 12
    var gender = "Male"

    fun makeSound(){
        println("Animal is speaking")
    }
}
open class Dogs:Animal() { //Child/derived/Sub class
    fun bark(){
        println("Dog is woofing")
    }
}
class Cat:Animal(){  //Child/derived/Sub class
    fun meow(){
        println("Cat is meowing")
    }
}

fun main() {
    var a = Animal()
    var d = Dogs()
    var c = Cat()

    d.makeSound()


}


