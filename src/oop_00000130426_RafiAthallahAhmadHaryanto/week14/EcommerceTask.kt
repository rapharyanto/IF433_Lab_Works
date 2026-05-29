package oop_00000130426_RafiAthallahAhmadHaryanto.week14

import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan Kalkuklasi + I/O + Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when(customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10*
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langusng di class bisnis
        file.appendText("$itemName, $finalPrice, $customerType")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName, $finalPrice, $customerType\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, pricingStrategy.javaClass.simpleName)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repo, notifier)

    val vip = VipPricing()
    val regular = RegularPricing()

    processor.processOrder("Keyboard", 500000.0, vip)
    processor.processOrder("Mouse", 200000.0, regular)
}