package patterns.factory

class ChicagoStyleCheesePizza(
        override var name: String = "Chicago Style Deep Dish Cheese Pizza\n",
        override var dough: String = "Extra Thick Crust Dough\n",
        override var sauce: String = "Plum Tomato Sauce\n",
        override var toppings: ArrayList<String> = arrayListOf("Shredded Mozzarella Cheese\n")
) : Pizza() {
    override fun cut() = print("Cutting the pizza into square slices\n")
}