fun numWords(newtext: String) { //ilość wyrazów

    val words = newtext.toString().trim() //usuniecie wiodących i końcowych
    val totalWords = Regex("""(\s+|(\r\n|\r|\n))""").findAll(words.trim()).count() + 1 //wzorzec słowa +licznik
    println("Ilość wyrazów: $totalWords")
}

fun uniqWords(newtext: String) { //szukanie unikatowych wyrazów

    println("Unikatowe wyrazy: ")

    val allWords = HashMap<String, Int>() //mapa wyrazów
    val regex = """(\s+|(\r\n|\r|\n))""".toRegex() //wydzielenie wyrazów

    newtext.split(regex).forEach { word -> //pętla na każdym elemencie listy
        val words = word
        if (allWords[words] != null) { //sprawdzenie czy nie jest null
            allWords[words] = allWords[words]!! + 1 //jeśli wyraz się powtarza, to zwiększenie
        } else {
            allWords[words] = 1 //gdy nie powtarza, przypisuje 1
        }
    }
    for ((k, v) in allWords) { //pętla na całej mapie
        if (v == 1) { //gdy wyraz wystąpił raz (czyli jest unikatowy), to ma wartość 1
            println("$k: ${k.length}")  //drukowanie wyrazu i jego długości
        }
    }
}


fun letterFrequency(text: String) { //częstotliwość wystąpienia liter

    println("Ilość liter: ")
    val newtext = text.replace(" ", "") //usunięcie spacji
    val mapLetter = HashMap<String, Int>() //mapa liter

    for (letter in newtext.split("")) { //pętla po literach z mapy, rozdzielanych za pomocą znaku
        if (letter == "") { //pominięcie białych znaków - początku i końca łańcucha znaków
            continue
        }
        if (mapLetter[letter] != null) { //sprawdzenie czy nie jest null
            mapLetter[letter] = mapLetter[letter]!! + 1 //gdy występuje, to zwiększenie o 1
        } else {
            mapLetter[letter] = 1 //gdy się nie powtarza to 1
        }

    }
    for ((k, v) in mapLetter) { //for po mapie liter
        print("$k: $v  ") //drukowanie wyrazu i jego ilości wystąpień
        for (i in 1..v) { //for po ilości wystąpień
            print("*") //drukowanie "wykresu" gwiazdek
        }
        println() //drukowanie całości z pętli, w każdej nowej linii
    }
}


fun main() { //program główny- wywołanie funkcji

    println("----------------------------------------------------------------------------------------------")
    var text = "The world is changed. I feel it in the water. I feel it in the earth. I smell it in the air."
    println("Tekst: $text")

    println("----------------------------------------------------------------------------------------------")
    val newtext = text.replace(".", "").uppercase() //usunięcie kropek i zamiana na wielkie litery
    println("Tekst bez kropek i wielkimi literami: $newtext")

    println("----------------------------------------------------------------------------------------------")
    numWords(newtext)

    println("----------------------------------------------------------------------------------------------")
    uniqWords(newtext)

    println("----------------------------------------------------------------------------------------------")
    letterFrequency(newtext)

}

