package lesson_1

fun main() {
//    – Для начала выведи в консоль значения всех объявленных ранее переменных;
//    – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000).
    //    Подбери подходящее наименование переменной, присвой ей значение и распечатай;
//    – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников,
    //    присвой новое значение количества работников этой переменной и распечатай в консоль.

    val intCountOrders : Int = 23;
    val stringTextGratitude : String = "Thanks for the order!";
    println(intCountOrders);
    println(stringTextGratitude);

    var shortWorkers: Short = 2000;

//    println(shortWorkers);

//    --shortWorkers;
    shortWorkers = 1999;
    println(shortWorkers);

}