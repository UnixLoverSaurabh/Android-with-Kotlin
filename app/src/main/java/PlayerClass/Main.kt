package PlayerClass

fun main(args: Array<String>) {
    val first = Player("Ram")
    first.show()

    val second = Player("Laxman")
    second.level = 2
    second.show()

    println(second.weapon.name.toUpperCase())
    println(second.weapon.damage)
}