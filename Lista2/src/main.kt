fun calculateCircle() {  //obliczenie pola koła
    println("Koło")
    println("Podaj promień r: ")
    val r = readLine()!!.toDouble() //sprawdzenie czy jest double
    val c1 = Circle("Koło", "Pole koła: PI*$r^2", r)
    println(c1.areaEquation +".  "+ c1)

}

fun calculateTriangle() { //obliczenie pola trójkąta
    println("Trójkąt")

    println("Podaj bok a: ")
    val a = readLine()!!.toDouble() //sprawdzenie czy jest double

    println("Podaj wysokość h: ")
    val h = readLine()!!.toDouble() //sprawdzenie czy jest double

    val t1 = Triangle("Trójkąt", "Pole trójkąta: $a*$h/2", a, h)
    println(t1.areaEquation +".  "+ t1)
}

fun calculateTrapezoid() { //pole trapezu
    println("Trapez")

    println("Podaj bok a: ")
    val a = readLine()!!.toDouble() //sprawdzenie czy jest double

    println("Podaj bok b: ")
    val b = readLine()!!.toDouble() //sprawdzenie czy jest double

    println("Podaj wysokość h: ")
    val h = readLine()!!.toDouble() //sprawdzenie czy jest double

    val t1 = Trapezoid("Trapez", "Pole trapezu:(($a+$b)*$h/2)", a, b, h)
    println(t1.areaEquation +".  "+ t1)
}

fun calculateRectangle() { //pole prostokąta
    println("Prostokąt")

    println("Podaj bok a: ")
    val a = readLine()!!.toDouble() //sprawdzenie czy jest double

    println("Podaj bok b: ")
    val b = readLine()!!.toDouble() //sprawdzenie czy jest double

    val r1 = Rectangle("Prostokąt", "Pole prostokąta:$a*$b", a, b)
    println(r1.areaEquation +".  "+ r1)
}

fun calculateSquare() { //pole kwadratu
    println("Kwadrat")

    println("Podaj bok a: ")
    val a = readLine()!!.toDouble() //sprawdzenie czy jest double

    val s1 = Square("Kwadrat", "Pole kwadratu:$a^2", a)
    println(s1.areaEquation +".  "+ s1)

}

fun main() {

    while (true) { //wykonuje się cały czas, gdy jest podana poprawna wartość (1-5)

        println("Jakie pole figury chcesz obliczyć? " +
                "1-koło, 2-trójkąt, 3- trapez, 4-prostokąt, 5- kwadrat")

        val read = readLine().toString() //odczytanie z terminala wartości podanej przez użytkownika

        when (read) {
            "1" -> calculateCircle()
            "2" -> calculateTriangle()
            "3" -> calculateTrapezoid()
            "4" -> calculateRectangle()
            "5" -> calculateSquare()
        }
    }


}