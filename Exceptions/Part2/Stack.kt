package Exceptions.Part2


class Stack<T>() {
    var collection = mutableListOf<T>()
    fun push(item: T) {
        collection.add(0, item)
    }

    fun pop(): T? {
        return if (collection.lastIndex == -1) null
        else collection.removeAt(0)
    }

    fun isEmpty(): Boolean {
        return collection.lastIndex == -1
    }
}