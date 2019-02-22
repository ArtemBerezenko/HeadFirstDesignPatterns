package patterns.factory.factory_method

class ChicagoStyleVeggiePizza(
        override var name: String = "Chicago Deep Dish Veggie Pizza",
        override var dough: String = "Extra Thick Crust Dough",
        override var sauce: String = "Plum Tomato Sauce",
        override val toppings: ArrayList<String> = arrayListOf("Shredded Mozzarella Cheese", "Black Olives",
               "Spinach", "Eggplant")
) : Pizza() {
    override fun cut() = print("Cutting the pizza into square slices")
}
