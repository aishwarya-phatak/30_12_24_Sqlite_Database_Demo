class Circle(x : Int, y : Int, var radius : Int) : Shape(x,y){

    constructor(r : Int):this(0, 0, r){
        println("secondary constructor of circle called")
    }

    override fun draw() {
        super.draw()
        println("Draw method of Circle class called")
    }

    override fun calculateArea() {
        super.calculateArea()
        println("Calculate Area method of Circle class called ${radius * radius * 3.14}")
    }

    override fun calculatePerimeter() {
        super.calculatePerimeter()
        println("Calculate Perimeter method of circle is called ${2 * 3.14 * radius}")
    }
}