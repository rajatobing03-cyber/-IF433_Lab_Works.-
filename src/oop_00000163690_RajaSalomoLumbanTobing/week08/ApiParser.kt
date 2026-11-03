package oop_00000163690_RajaSalomoLumbanTobing.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type) {

            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12

                Electronic(
                    id = id,
                    name = name,
                    warrantyMonths = warranty
                )
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"

                Clothing(
                    id = id,
                    name = name,
                    size = size
                )
            }

            else -> null
        }
    }
}