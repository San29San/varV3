fun main(args: Array<String>) {

    //эта программа считает объём параллелограмма
   println("Для расчета объёма параллелограмма введите первую цифру")
    val side1 = readln().toInt()
    println("Введите вторую цифру")
    val side2 = readln().toInt()
    println("Введите третью цифру")
    val side3 = readln().toInt()
    val obym = side1 * side2 * side3
 println("Объём параллелограмма равен")
    println(obym)

}