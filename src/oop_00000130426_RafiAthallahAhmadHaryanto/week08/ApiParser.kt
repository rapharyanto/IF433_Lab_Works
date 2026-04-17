package oop_00000130426_RafiAthallahAhmadHaryanto.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Wajib: ambil id & name pakai requireNotNull (akan throw jika null)
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        // Ambil type (boleh null, jadi pakai as?)
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // as? Int + fallback Elvis
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                // as? String + fallback Elvis
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }

            else -> null // tipe tidak dikenal
        }
    }
    fun checkout(product: Product) {
        // Ekstrak ID pakai when (karena sealed class)
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Panggil Java static method
        val transactionId = JavaPaymentService.processPayment(productId)!!

        // Print hasil
        println("Transaction ID: $transactionId")
    }
}