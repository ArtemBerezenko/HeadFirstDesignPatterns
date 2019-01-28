package patterns.factory

abstract class Pizza {
    open lateinit var name: String
    open lateinit var dough: String
    open lateinit var sauce: String
    open val toppings = arrayListOf<String>()

    fun prepare() {
        print("Preparing $name\n")
        print("Tossing dough...\n")
        print("Adding sauce...\n")
        print("Adding toppings...")
        for (i in 0 until toppings.size) {
            print("  ${toppings[i]}")
        }
    }

    fun bake() = print("Bake for 25 min at 350\n")
    open fun cut() = print("Cutting the pizza into diagonal slices\n")
    fun box() = print("Place pizza in official PizzaStore box\n")
}