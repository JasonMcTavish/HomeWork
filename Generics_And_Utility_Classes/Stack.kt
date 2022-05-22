package Generics_And_Utility_Classes

import java.util.Stack
import java.util.ArrayDeque

class Stack<T> {
     private var collection= ArrayDeque<T>()

    fun push(item: T) {
        collection.push(item)
    }

    fun pop(): T {
        return collection.pop()
    }

    fun isEmpty(): Boolean {
        return collection.isEmpty()
    }
}