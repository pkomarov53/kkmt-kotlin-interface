class EuroConverter: CurrencyConverter {

    override val currencyNode: String
        get() = "EUR"

    override fun convertRub(cashAmount: Double): Double {
        return (cashAmount * 75.81)
    }
}