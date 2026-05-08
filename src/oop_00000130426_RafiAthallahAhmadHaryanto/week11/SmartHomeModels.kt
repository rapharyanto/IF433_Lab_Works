package oop_00000130426_RafiAthallahAhmadHaryanto.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)