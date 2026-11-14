package oop_00000163690_RajaSalomoLumbanTobing.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respon: ${response.status}")
    println("Daftar Koin di Dompet:")
    response.data.forEach { coin -> println("- Koin: ${coin.name}, Saldo: ${coin.balance}")
}