package patterns.factory

class NYStyleCheesePizza(
        override var name: String = "NY Style Sauce and Cheese Pizza\n",
        override var dough: String = "Thin Crust Dough\n",
        override var sauce: String = "Marinara Sauce\n",
        override var toppings: ArrayList<String> = arrayListOf("Grated Reggiano Cheese\n")
) : Pizza()