fun main(args: Array<String>) {
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    println("Your age is $age")

    when {
        age < 18 -> {
            println("You are to young to vote")
        }
        age >= 21 -> {
            println("You can vote now")
        }
        else -> {
            println("Wait for your turn")
        }
    }

    if(age < 18) {
        println("You are to young to vote")
    }
    else if(age >= 21) {
        println("You can vote now")
    }
    else {
        println("Wait for your turn")
    }
}