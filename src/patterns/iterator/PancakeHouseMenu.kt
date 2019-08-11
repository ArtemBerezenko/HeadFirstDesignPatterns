package patterns.iterator

class PancakeHouseMenu : Menu{
    val menuItems: ArrayList<MenuItem> = arrayListOf()

    init {
        addItem("K&B Pancake Breakfast",
                "Pancake with scrambled eggs, and toasts",
                true,
                2.99)
        addItem("Regular pancake breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator() = menuItems.iterator()

}