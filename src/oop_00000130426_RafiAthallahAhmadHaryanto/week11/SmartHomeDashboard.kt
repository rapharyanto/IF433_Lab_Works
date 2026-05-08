package oop_00000130426_RafiAthallahAhmadHaryanto.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    // configure smart lamp
    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    //configure security camera
    SmartDevice("Ezviz Outdoor", "Camera"). apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("[LOG] Security Camera is Connected")
        homeDevices.add(it)
    }
}