package oop_00000163690_RajaSalomoLumbanTobing.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()


    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 500.0))


    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respon: ${response.status}")
    println("Daftar Koin di Dompet:")
    response.data.forEach { coin ->
        println("- Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    println("\n-----------------------------------\n")

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 0.2))
    txRepo.add(Transaction("TX-002", 1.5))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("Status Respon Transaksi: ${txResponse.status}")
    println("Daftar Transaksi:")
    txResponse.data.forEach { tx ->
        println("- ID: ${tx.id}, Jumlah: ${tx.amount}")
    }
}