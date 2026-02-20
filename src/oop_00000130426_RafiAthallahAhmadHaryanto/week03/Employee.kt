package oop_00000130426_RafiAthallahAhmadHaryanto.week03

class Employee (val name: String){
    var salary: Int = 0
        set (value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // Kita memanggil setter di dalam setter
            this.salary = value
        }
}