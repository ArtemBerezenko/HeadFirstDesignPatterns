package patterns.factory

class ChicagoStyleClamPizza(
        override var name: String = "Chicago Style Clam Pizza",
        override var dough: String = "Extra Thick Crust Dough",
        override var sauce: String = "Plum Tomato Sauce",
        override var toppings: ArrayList<String> = arrayListOf("Shredded Mozzarella Cheese", "Frozen Clams from Chesapeake Bay")
) : Pizza() {
    override fun cut() = print("Cutting the pizza into square slices")
}
