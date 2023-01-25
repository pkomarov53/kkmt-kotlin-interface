class UsdConverter: CurrencyConverter {

    override val currencyNode: String = "USD"

    override fun convertRub(cashAmount: Double): Double {
        return (cashAmount * 69.32)
    }
}