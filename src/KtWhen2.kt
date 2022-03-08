import java.time.MonthDay

fun main(args: Array<String>){

    println("Enter any number between 1 - 7")
    var day = Integer.valueOf(readLine())
    when(day){
        1 -> println("Its on a Monday")
        2 -> println("Its on a Tuesday")
        3 -> println("Its on a Wednesday")
        4 -> println("Its on a Thursday")
        5 -> println("Its on a Friday")
        6 -> println("Its on a Saturday")
        7 -> println("Its on a Sunday")

        else -> "Enter a valid number (1 - 7)"
    }
}