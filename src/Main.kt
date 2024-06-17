fun main() {
    /**
     * 1 Задача. Дан список целых чисел. Необходимо найти сумму его элементов начиная с 3 заканчивая 9.
     */
    println("\n***1 ЗАДАЧА***\n")
    val numbersList = listOf(2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2)
    val sumOfNumbersList = numbersList.foldIndexed(0) { id, sum, element ->
        if (id in 3..9) sum + element else sum
    }
    println(sumOfNumbersList)
    /**
     * 2 Задача. Дан список целых чисел. С помощью функции fold вывести элементы этой коллекции в строку. Т.е. входной
     * список: val numbers = listOf(1, 2, 3, 4). Выходные данные: 1234
     */
    println("\n***2 ЗАДАЧА***\n")
    val numbers = listOf(1, 2, 3, 4)
    val numbersToString = numbers.fold("") { a, b -> "$a$b" }
    println(numbersToString)
    /**
     * 3 Задача. Создать data класс Player, который характеризует игрока с именем, количеством заработанных очков и
     * выигранных денег. Создать список таких игроков с произвольными данными в конструкторе. Посчитать и вывести в
     * консоль общее количество очков и выигранных денег.
     */
    println("\n***3 ЗАДАЧА***\n")
    val listOfPlayers = listOf(
        Player("Anna", 100, 500),
        Player("Igor", 50, 250),
        Player("Ivan", 200, 1000),
        Player("Victor", 300, 5000)
    )
    var sumOfScore = 0
    var sumOfMoney = 0
    for (player in listOfPlayers) {
        sumOfScore += player.score
        sumOfMoney += player.money
    }
    println(sumOfScore)
    println(sumOfMoney)
    val sumOfScoreTwo = listOfPlayers.foldIndexed(0) { id, sum, element ->
        if (id in listOfPlayers.indices) sum + element.score else sum
    }
    println(sumOfScoreTwo)
    val sumOfMoneyTwo = listOfPlayers.foldIndexed(0) { id, sum, element ->
        if (id in listOfPlayers.indices) sum + element.money else sum
    }
    println(sumOfMoneyTwo)
    /**
     * 4 Задача. Дан список фруктов. Необходимо сгруппировать элементы этого списка по первому символу с таким расчетом,
     * чтобы в группу входили только фрукты с четной длиной строки каждого элемента. Т.е. входной список такой:
     * val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко"). Выходной результат:
     * {я=[Яблоко, яблоко], а=[], б=[], в=[Виноград], к=[]}
     */
    println("\n***4 ЗАДАЧА***\n")
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    val filteredMapOfFruits = fruits.filter  { it.length % 2 == 0 }
    val mapOfFruits = filteredMapOfFruits.groupBy { it.first().lowercase() }
    println(mapOfFruits)
}


//3
data class Player(val name: String, val score: Int, val money: Int)

