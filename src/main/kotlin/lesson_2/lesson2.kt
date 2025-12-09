//Задача 2 к Уроку 2
//
//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.


fun main() {
    val salary50 = 30000;
    val salary_20 = 20000;
    val count_people_with_hight_salary = 50;
    val count_people_with_low_salary = 20;
    val common_expenes_50 = salary_50 * count_people_with_hight_salary;
    val common_expenes_20 = salary_20 * count_people_with_low_salary;
    val average_expenes = (CommonExpenes_20 + CommonExpenes_50) / 70;
    println(CommonExpenes_50);
    println(CommonExpenes_20);
    println(AverageExpenes);

}