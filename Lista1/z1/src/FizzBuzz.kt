fun isNumber(readN: String): Boolean { //sprawdzenie czy wpisana wartość jest liczbą
    return !readN.isNullOrEmpty() && readN.matches(Regex("\\d+"))
}

fun main() { //działanie programu

    while (true) {

        println("Enter a number: ")
        var readN = readLine().toString() //odczytanie wartości podanej przez użytkownika

        if (!isNumber(readN)) { //gdy warunek niespełniony ma kontynuować aż zostanie podana prawidłowa wartość
            println("It's not a number!")
            continue
        }

        val checkNum = readN.toInt()

        if (checkNum % 3 == 0 && checkNum % 5 == 0) { //sprawdzenie czy liczba jest podzielna, za pomocą modułu liczby
            println("Number: $checkNum | Result: FizzBuzz ")
        } else if (checkNum % 5 == 0) {
            println("Number: $checkNum | Result: Buzz ")
        } else if (checkNum % 3 == 0) //checkNum % 3 == 0
            println("Number: $checkNum | Result: Fizz ")
        else {
            println("Number: $checkNum | Result: Not divisable by 3 or 5")

        }
    }
}
