package patterns.templateMethod

fun main() {
    val coffeeHook = CoffeeWithHook()
    val tea = Tea()
    val coffee = Coffee()

    println("Making tea: ")
    tea.prepareRecipe()

    println("Making coffee: ")
    coffee.prepareRecipe()
    coffeeHook.prepareRecipe()


}