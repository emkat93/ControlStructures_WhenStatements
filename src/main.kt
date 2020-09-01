fun main(){
    var number = 0
    var numberString = "x"

    print("Enter a number between 1 and 10: ")
    number = readLine()!!.toInt()

    when (number){
        1 -> numberString = "The number 1 is uno in Spanish"
        2 -> numberString = "The number 2 is dos in Spanish"
        3 -> numberString = "The number 3 is tres in Spanish"
        4 -> numberString = "The number 4 is cuatro in Spanish"
        5 -> numberString = "The number 5 is cinco in Spanish"
        6 -> numberString = "The number 6 is seis in Spanish"
        7 -> numberString = "The number 7 is siete in Spanish"
        8 -> numberString = "The number 8 is ocho in Spanish"
        9 -> numberString = "The number 9 is nueve in Spanish"
        10 -> numberString = "The number 10 is diez in Spanish"
        !in 1..10 -> numberString = "Out of Range"
        else -> numberString = "Unknown"
    }

    println("The number is $numberString")
}