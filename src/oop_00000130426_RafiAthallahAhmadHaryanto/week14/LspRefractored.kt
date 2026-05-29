package oop_00000130426_RafiAthallahAhmadHaryanto.week14

interface Shape {
    fun area(): Int
}

class safeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}