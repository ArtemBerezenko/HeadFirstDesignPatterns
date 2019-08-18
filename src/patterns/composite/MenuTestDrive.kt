package patterns.composite


fun main() {
    val pancakeHouseMenu = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu = Menu("DINER MENU", "Lunch")
    val cafeMenu = Menu("CAFE MENU", "Dinner")
    val dessertMenu = Menu("DESSERT MENU", "Dessert of course!")

    val allMenus = Menu("ALL MENUS", "All menus combined")
    allMenus.run {
        add(pancakeHouseMenu)
        add(dinerMenu)
        add(cafeMenu)
    }

    dinerMenu.add(MenuItem("Pasta", "Spaghetti", true, 3.98))
    dinerMenu.add(dessertMenu)
    dessertMenu.add(MenuItem("Apple Pie", "Apple Pie with a flakey crust", true, 1.59))
    val waitress = Waitress(allMenus)
    waitress.printMenu()
    waitress.printVegetarianMenu()
}