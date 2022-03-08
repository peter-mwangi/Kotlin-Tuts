import java.util.*

fun main(args: Array<String>)
{
    var read = Scanner(System.`in`)
    println("Enter Age")
    var age = read.nextInt()

    var ageProvided = when(age){

        10 -> "You are underage"
        18 -> "You are an adult with zero years of experience"
        20 -> "You have 2 years of experience"

        else -> "Invalid! Age Must be 10, 18 or 20"
    }
    println("$age , $ageProvided")
}