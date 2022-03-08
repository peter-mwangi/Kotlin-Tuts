import java.util.*

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    println("Enter Name:")
    val name = readLine()
    println("Enter your ID Number:")
    var idNo = read.nextInt()
    println("Enter age")
    var age = read.nextInt()

    println("Your Name is: "+name+", Your ID Number is: "+idNo+ ", Your Age is: "+age)
}