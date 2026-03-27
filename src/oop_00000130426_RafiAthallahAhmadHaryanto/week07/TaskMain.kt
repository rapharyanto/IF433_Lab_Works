package oop_00000130426_RafiAthallahAhmadHaryanto.week07

fun main () {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Item Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")

    // Buat senjata starter dari factory
    val starterWeapon = Weapon.forgeStarterSword()

    // Cetak detail senjata
    println("\nStarter Weapon:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")
}