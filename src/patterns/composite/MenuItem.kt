package patterns.composite

class MenuItem(
        val name: String,
        val description: String,
        val vegetarian: Boolean,
        val price: Double
) : MenuComponent() {
    override fun createIterator(): Iterator<MenuComponent> = NullIterator()

    override fun isVegetarian(): Boolean = vegetarian

    override fun print() {
        print(" $name")
        if (vegetarian) print("(vegetarian)")
        println(", $price")
        println("    -- $description")
    }

}