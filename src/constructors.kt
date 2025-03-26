class Dog(var name:String,var breed:String,var age:Int){

}

fun main() {
    var dog2 = Dog("Brighton","Chihuahua",3)
    println(dog2.name)
    var dog3 = Dog("Jerry","PitBull",2)
    println(dog3.breed)
    var dog1 = Dog("Tina","Siberian Husky",3)
    println(dog1.breed)
    var dog4 = Dog("Perpetua","German Shepherd",1)
    println(dog4.age)
}