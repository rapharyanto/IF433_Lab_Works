package practice_Mid

class Car (name: String = "F150 Raptor") {
    var speed: Int = 0  //default
        get() = field + 100 // ini getter dan setter pnya speed?
        set (value) {
            if(speed >= 120) {
                println("Speed diatas rata rata"); field = 50
            } else {
                println("speed normal"); field = value
            }
        }

    var speed2: Int = 0  //default
        get() = field + 100 //ini getter dan setter pnya speed 2?
        set (value) {
            if(speed2 >= 120) {
                println("Speed diatas rata rata"); field = 50
            } else {
                println("speed normal"); field = value
            }
        }
}

fun main() {
    val Car = Car()

    println(Car.speed)
    Car.speed = 120
    Car.speed = 200
    Car.speed = 50
}