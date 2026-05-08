package oop_00000130426_RafiAthallahAhmadHaryanto.week10

interface HasName {
    val name: String
}

class WalletRepository <T: Any> (){
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is HasName && it.name.contains(keyword, ignoreCase = true)
        }
    }
}