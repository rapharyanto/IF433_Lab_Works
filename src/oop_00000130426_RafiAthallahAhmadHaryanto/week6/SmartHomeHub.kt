package oop_00000130426_RafiAthallahAhmadHaryanto.week6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){ devices.add(device) }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if(device is Switchable) device.turnOff()
        }
    }
}