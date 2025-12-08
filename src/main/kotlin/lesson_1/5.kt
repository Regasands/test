//Задача 5* к Уроку 1
//
//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.
const val TIME_SECOND_TO_HOURS: Int = 3600
const val TIME_MINUTE_TO_HOURS: Int = 60;
fun main() {
        val seconds: Short = 6480;

        val hour = seconds / TIME_SECOND_TO_HOURS;
        val remainingHours = seconds % TIME_SECOND_TO_HOURS;
        val minute = remainingHours / TIME_MINUTE_TO_HOURS;
        val secondsDiv = remainingHours % TIME_MINUTE_TO_HOURS;


        println(String.format("%01d:%01d:%01d", hour, minute, secondsDiv));


}