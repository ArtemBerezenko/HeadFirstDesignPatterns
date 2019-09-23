package patterns.templateMethod

class Tea : CaffeineBeverage() {

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun brew() {
        println("Steeping the tea")
    }
}