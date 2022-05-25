abstract class Figure(
    //klasa figura
    open val name: String,
    open val areaEquation: String,
) {
    abstract fun calcArea(): Double

    override fun toString(): String { //przysłonięcie funkcji, zwraca wynik calcArea
        return "Wynik :" + this.calcArea();
    }
}