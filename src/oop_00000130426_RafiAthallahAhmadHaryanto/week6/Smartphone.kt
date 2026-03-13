package oop_00000130426_RafiAthallahAhmadHaryanto.week6

class Smartphone: Camera, Phone {
    // Manually override to resolve abiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}