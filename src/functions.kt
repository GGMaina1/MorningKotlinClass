import java.util.Currency

fun main() {
    //Standard library functions/ Predefined functions
    var output = Math.sqrt(64.0)
    println("The squareroot of 64.0 is $output")

    var roundedvalue = Math.round(67.25)
    println(roundedvalue)

    //calling function name
    name()
    sum()
    employee("Albert ",10000,false)
    employee("Martha ",50000,true)
    student("Janet",15,"Software Engineering")




}

//User defined functions
fun name() {
    println("Albert")
}
fun sum(){
    var x = 20
    var y = 40
    println(x + y)
}

//Parameters/variable and arguments/value
fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary. Disability $disability")
}
fun student(name:String,age:Int,course:String){
    println("$name is $age yrs old and is studying $course" )
}

