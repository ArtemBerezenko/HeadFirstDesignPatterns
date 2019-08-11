package patterns.iterator

fun main() {
    Waitress(PancakeHouseMenu(), DinerMenu()).apply { printMenu() }
}