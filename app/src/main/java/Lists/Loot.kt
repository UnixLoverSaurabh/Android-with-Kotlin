package Lists

fun main(args: Array<String>) {
    val color = ArrayList<String>()
    color.add("First")
    color.add("Second")
    color.add("Third")
    color.add("Fourth")
    color.add("Fifth")

    for(i in color) {
        print("$i ")
    }
    println()

    println(color[2] + " " + color.get(2))
}