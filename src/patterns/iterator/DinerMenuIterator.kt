package patterns.iterator

import java.lang.IllegalStateException

class DinerMenuIterator(private val items: Array<MenuItem?>) : MutableIterator<MenuItem?> {

    private var position: Int = 0

    override fun hasNext(): Boolean = position <= items.size && items[position] != null

    override fun next(): MenuItem?  = items[position++]

    override fun remove() {
        if (position <= 0) throw IllegalStateException("You can't remove an item until you've done at least one next()")
        if (items[position - 1] != null) {
            for (i in position - 1 until items.size - 1) {
                items[i] = items[i + 1]
            }
            items[items.size - 1] = null
        }
    }
}