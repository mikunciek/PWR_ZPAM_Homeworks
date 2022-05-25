open class Rectangle(
    //klasa prostokąt
    override val name: String,
    override val areaEquation: String,
    a: Double,
    b: Double,

    ) : Trapezoid(name, areaEquation, a, a, b) {
}