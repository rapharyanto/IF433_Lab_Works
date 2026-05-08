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

    // configure security camera
    SmartDevice("Ezviz Outdoor", "Camera"). apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("[LOG] Security Camera is Connected")
        homeDevices.add(it)
    }

    // configure AC with run
    val airConditioner = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }
    homeDevices.add(airConditioner)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {

        println("\n=== SMART HOME SUMMARY ===")
        println("Device amount: ${this.size}")

    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total power on device: $totalPower Watt")
}