package oop_00000163690_RajaSalomoLumbanTobing.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 500.0))
}