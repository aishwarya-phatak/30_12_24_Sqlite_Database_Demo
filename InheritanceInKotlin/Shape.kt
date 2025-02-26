//open keyword is used for inheritance in kotlin
//by default classes are final

open class Shape(var x : Int, var y : Int){

    constructor(): this(0,0){
        println("secondary constructor of Shape class is called")
    }

    open fun draw(){
        println("draw of base class Shape")
    }

    open fun calculateArea(){
        println("area of base class Shape")
    }

    open fun calculatePerimeter(){
        println("perimeter of base class Shape")
    }
}