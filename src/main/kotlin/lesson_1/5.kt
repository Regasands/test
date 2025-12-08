//Задача 5* к Уроку 1
//
//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
        val seconds: Short = 6480;

        val hour = seconds / 3600;
        val remainingHours = seconds % 3600;
        val minute = remainingHours / 60;
        val secondsDiv = remainingHours % 60;

        val hourStr = hour.toString().padStart(2, '0');
        val minuteStr = minute.toString().padStart(2, '0');
        val secondsStr = secondsDiv.toString().padStart(2, '0');
        println("$hourStr:$minuteStr:$secondsStr");


}