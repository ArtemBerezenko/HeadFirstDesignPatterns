package patterns.factory

class ChicagoStylePepperoniPizza(
        override var name: String = "Chicago Style Pepperoni Pizza",
        override var dough: String = "Extra Thick Crust Dough",
        override var sauce: String = "Plum Tomato Sauce",
        override var toppings: ArrayList<String> = arrayListOf("Shredded Mozzarella Cheese", "Black Olives",
                "Spinach", "Eggplant", "Sliced Pepperoni")
) : Pizza() {
    override fun cut() = print("Cutting the pizza into square slices")
}
