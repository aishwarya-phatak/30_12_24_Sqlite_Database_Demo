class Rectangle(x : Int, y : Int, var length : Int, var breadth : Int): Shape(x, y) {

    constructor(l : Int, b : Int) : this(0,0,l, b){
        println("Secondary constructor of Rectangle class")
    }

    override fun draw() {
        super.draw()
        println("draw method of Shape class is called")
    }

    override fun calculateArea() {
        super.calculateArea()
        println("area method of rectangle class is called")
        println("area of rectangle is : ${length * breadth}")
    }

    override fun calculatePerimeter() {
        super.calculatePerimeter()
        println("perimeter method of rectangle class is called")
        println("perimeter method of rectangle is : ${2 * (length + breadth)}")
    }
}