package patterns.iterator

class PancakeHouseIterator(private val menuItems: ArrayList<MenuItem>) : Iterator {
    private var position = 0

    override fun hasNext(): Boolean = position <= menuItems.size - 1

    override fun next(): Any = menuItems[position++]
}