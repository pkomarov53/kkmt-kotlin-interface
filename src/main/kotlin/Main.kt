fun main() {
    val euroCode = Converters.get("EUR")
    euroCode.convertRub(10.0)

    val usdCode = Converters.get("USD")
    usdCode.convertRub(10.0)

    val unknownCode = Converters.get("BLN")
    unknownCode.convertRub(10.0)
}