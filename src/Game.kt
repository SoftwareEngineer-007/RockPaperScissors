fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        // Ask the user for their choice
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        // Read user input
        val userInput = readLine()
        // Validate user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        // if an invalid option is selected - notify the user
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}


fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    // Determine the result
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You WIN!!!"
    else result = "You lose!"
    // Print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}