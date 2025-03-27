open class Shape{
    open fun draw(){
        println("Drawing a shape")
        println("Hello")
    }
}
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus ")
    }
}
class Parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {
    var s = Shape()
    var r = Rhombus()
    var p =Parallelogram()

    s.draw()
    r.draw()
    p.draw()
}
