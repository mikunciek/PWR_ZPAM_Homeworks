import kotlin.math.PI

class Circle(
    //klasa koło
    override val name: String,
    override val areaEquation: String,
    val radiusCircle: Double,

    ) : Figure(name, areaEquation) {

    override fun calcArea(): Double {
        return (PI * radiusCircle * radiusCircle)
    }
}