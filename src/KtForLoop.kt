fun main(args: Array<String>)
{
    var ages = arrayOf(12, 14, 16, 18, 19, 20, 24, 25)
    var firstElmt = ages[0]
    var lastElmt = ages[ages.size -1]
    println("First array element is: $firstElmt and Last element is: $lastElmt")

    for (age in ages)
    { //returning odd values in the array
        println(age)
        if (age % 2 != 0)
        {
            val oddAges = arrayOf(age)
            for (oddAge in oddAges)
            {
                println("Odd Age values $oddAge")
            }
        }
    }
}