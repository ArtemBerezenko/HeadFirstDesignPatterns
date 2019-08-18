package patterns.iterator

class Waitress(private val pancakeHouseMenu: Menu, private val dinerMenu: Menu) {

    fun printMenu() {
        print("Menu\n ----- \nBreakfast")
        printMenu(pancakeHouseMenu.createIterator())
        print("\nLunch")
        printMenu(dinerMenu.createIterator())
    }

    private fun printMenu(iterator: MutableIterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            print("\n")
            print("${menuItem.name},")
            print("${menuItem.price} -- ")
            print(menuItem.description)
        }
    }
}