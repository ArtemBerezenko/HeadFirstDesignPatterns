package patterns.iterator

import kotlin.collections.Iterator

class DinerMenu : Menu{
    private val MAX_ITEMS = 6
    private var numberOfItems = 0
    private var menuItems = arrayOfNulls<MenuItem>(MAX_ITEMS)

    init {
        addItem("Vegetarian BLT",
                "(Fakin) Bacon with lettuce & tomato on whole wheat",
                true,
                2.99)
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99)
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        if (numberOfItems >= MAX_ITEMS) {
            print("Sorry, menu is full! Can't add item to menu")
        } else {
            menuItems[numberOfItems] = MenuItem(name, description, vegetarian, price)
            numberOfItems++
        }
    }

    override fun createIterator() = DinerMenuIterator(menuItems) as MutableIterator<MenuItem>
}