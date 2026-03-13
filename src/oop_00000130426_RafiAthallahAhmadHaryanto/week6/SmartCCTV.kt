package oop_00000130426_RafiAthallahAhmadHaryanto.week6

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun startRecord() {
        println("Record started.")
    }
    override fun stopRecord() {
        println("Record stopped.")
    }

    override fun turnOn() {
        println("CCTV has been turned on.")
        startRecord()
    }
    override fun turnOff() {
        println("CCTV has been turned off.")
        stopRecord()
    }
}
