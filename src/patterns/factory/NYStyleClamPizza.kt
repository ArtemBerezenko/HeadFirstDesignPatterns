package patterns.factory

class NYStyleClamPizza(
        override var name: String = "NY Style Clam and Cheese Pizza",
        override var dough: String = "Thin Crust Dough",
        override var sauce: String = "Marinara Sauce",
        override var toppings: ArrayList<String> = arrayListOf("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound")
) : Pizza()
