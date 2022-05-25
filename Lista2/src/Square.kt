open class Square(
    //klasa kwadrat
    override val name: String,
    override val areaEquation: String,
    a: Double,
    
    ) : Rectangle(name, areaEquation, a, a) {
}
