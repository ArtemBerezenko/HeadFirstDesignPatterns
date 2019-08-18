package patterns.composite

class Menu(
        val name: String,
        val description: String) : MenuComponent() {

    private val menuComponents: MutableList<MenuComponent> = mutableListOf()
    val iterator: CompositeIterator? = null

    override fun add(menuComponent: MenuComponent) = menuComponents.add(menuComponent)

    override fun remove(menuComponent: MenuComponent) = menuComponents.remove(menuComponent)

    override fun getChild(i: Int): MenuComponent = menuComponents[i]

    override fun print() {
        print("\n $name")
        println(", $description")
        println("------------------------")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }

    override fun createIterator() = iterator ?: CompositeIterator(menuComponents.iterator())
}