package Class.variousclass

sealed class SealedHyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : SealedHyundaiCar("아반뗴", 1_000L)

class Sonata : SealedHyundaiCar("소나타", 2_000L)

class Grandeur : SealedHyundaiCar("그렌저", 3_000L)
