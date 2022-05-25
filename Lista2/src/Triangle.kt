class Triangle(
    //klasa trójkąt
    override val name: String,
    override val areaEquation: String,
    val a: Double,
    val h: Double,

    ) : Figure(name, areaEquation) {

    override fun calcArea(): Double {
        return (a * h * 0.5)
    }
}