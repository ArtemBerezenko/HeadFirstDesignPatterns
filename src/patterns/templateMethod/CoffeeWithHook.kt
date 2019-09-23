package patterns.templateMethod

import java.io.BufferedReader
import java.io.InputStreamReader

class CoffeeWithHook : CaffeineBeverage() {
    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun customerWantsCondiments(): Boolean = getUserInput().toLowerCase().startsWith("y")

    private fun getUserInput(): String {
        var answer = ""
        println("Would you like milk and sugar with your coffee (y/n)? ")
        BufferedReader(InputStreamReader(System.`in`)).use { input ->
            answer = input.readLine()
        }
        if (answer.isEmpty()) {
            return "no"
        }
        return answer
    }
}