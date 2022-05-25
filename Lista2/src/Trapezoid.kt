open class Trapezoid(
    //klasa trapez
    override val name: String,
    override val areaEquation: String,
    open val a: Double,
    open val b: Double,
    open val h: Double,

    ) : Figure(name, areaEquation) {

    override fun calcArea(): Double {
        return ((a + b) * h / 2)
    }
}