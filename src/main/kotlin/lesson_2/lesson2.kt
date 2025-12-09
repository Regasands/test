package lesson_2
//Задача 3 к Уроку 2
//
//Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а
// время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль в формате [часы:минуты], используя двузначное представление чисел (например, 17:05, а не 17:5).

const val MINUTE_TO_HOUR = 60;

fun main() {
    val start_hour: Byte = 9;
    val start_minute: Short = 39;
    val duration_of_trip = 457;
    val sum_minute = start_minute + duration_of_trip;
    val end_hour = start_hour + (sum_minute / MINUTE_TO_HOUR );
    val end_minute = sum_minute % MINUTE_TO_HOUR;
    println("%02d:%02d".format(end_hour, end_minute));
};