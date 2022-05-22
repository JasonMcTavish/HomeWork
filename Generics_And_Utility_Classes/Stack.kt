package Generics_And_Utility_Classes


class Stack<T>(){
    var collection = mutableListOf<T>()
    fun push(item:T){
        collection.add(0,item)
    }
    fun pop():T{
        val item = collection[0]
        collection.removeAt(0)
        return item
    }
    fun isEmpty():Boolean{
        return collection.indices == 0 downTo -1
    }
}