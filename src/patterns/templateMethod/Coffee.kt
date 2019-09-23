package patterns.templateMethod

class Coffee : CaffeineBeverage() {

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun brew() {
        println("Dripping Coffee through filter")
    }
}