package oop_00000130426_RafiAthallahAhmadHaryanto.week03

import java.util.Scanner

class Weapon (val name: String){
    var damage: Int = 0
        set(value) {
            if(value < 0) {
                println("WARNING: Do not input negative number!")
                field = value
            }else if(value > 1000){
                field = 1000
            }else {
                field = value
            }
        }
    var tier: String = ""
        get(){
            if(damage > 800) {
                return "Legendary"
            }else if(damage > 500) {
                return "Epic"
            }else return "Common"
        }

    fun printStat() {
        println("=== WEAPON STATUS ===")
        println("Weapon Name: $name")
        println("Weapon Damage: $damage")
        println("Weapon Tier: $tier")
    }
}

