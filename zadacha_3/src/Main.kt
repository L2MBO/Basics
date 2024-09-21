fun main() {
    // Ввод натурального числа от пользователя
    print("Введите натуральное число: ")
    val input = readlnOrNull()

    // Проверка на корректность ввода
    if (input != null && input.all { it.isDigit() } && input.toInt() > 0) {
        // Преобразование строки в целое число
        val number = input.toInt()

        // Преобразование в двоичную систему
        val binaryString = number.toString(2)

        // Вывод результата
        println("Двоичное представление числа $number: $binaryString")
    } else {
        println("Ошибка: Введите корректное натуральное число.")
    }
}