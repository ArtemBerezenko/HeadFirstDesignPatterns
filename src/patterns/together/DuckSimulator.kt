package patterns.together

import patterns.together.composite.Flock
import patterns.together.decorator.QuackCounter
import patterns.together.factory.AbstractDuckFactory
import patterns.together.factory.CountingDuckFactory
import patterns.together.factory.GooseFactory
import patterns.together.observer.Quackologist
import patterns.together.observer.impl.Observable

fun main() {
    simulate(CountingDuckFactory())
    simulate(GooseFactory())
}

fun simulate(duckFactory: AbstractDuckFactory) {
    val mallardDuck = duckFactory.createMallardDuck()
    val redheadDuck = duckFactory.createRedheadDuck()
    val duckCall = duckFactory.createDuckCall()
    val rubberDuck = duckFactory.createRubberDuck()
    println("Duck Simulator: With Observer")
    val quackologist = Quackologist()


    val flockOfDucks = Flock()


    flockOfDucks.add(mallardDuck)
    flockOfDucks.add(redheadDuck)
    flockOfDucks.add(duckCall)
    flockOfDucks.add(rubberDuck)

    val flockOfMallards = Flock()

    val mallardDuck1 = duckFactory.createMallardDuck()
    val mallardDuck2 = duckFactory.createMallardDuck()
    val mallardDuck3 = duckFactory.createMallardDuck()
    val mallardDuck4 = duckFactory.createMallardDuck()

    flockOfMallards.add(mallardDuck1)
    flockOfMallards.add(mallardDuck2)
    flockOfMallards.add(mallardDuck3)
    flockOfMallards.add(mallardDuck4)

    flockOfDucks.add(flockOfMallards)

    flockOfDucks.registerObserver(quackologist)
    flockOfMallards.registerObserver(quackologist)

    println("Duck Simulator: Whole Flock Simulator")
    simulate(flockOfDucks)

    println("Duck Simulator: Mallard Duck Simulator")
    simulate(flockOfMallards)

    println("The ducks quacked ${QuackCounter.numberOfQuacks} times")

}

private fun simulate(duck: Quackable) = duck.quack()