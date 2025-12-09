//Задача 1 к Уроку 2
//
//Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
// У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.
//
//– Написать выражение, которое высчитывает средний балл;
//– Распечатать результат в консоль;
//– В консоли должно быть выведено дробное число с 2 знаками после запятой

fun main() {
    val first_student = 3;
    val second_student = 4;
    val third_student = 3;
    val fourth_student = 5;
    val count_student = 4;
    val result_average_point = (first_student + second_student + third_student + fourth_student).toFloat() / 4;
    println("%.2f".format(result_average_point))
}
