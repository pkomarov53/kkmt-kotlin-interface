class EuroConverter: CurrencyConverter {

    override val currencyCode: String
        get() = "EUR"

    override fun convertRub(cashAmount: Double) = println("$cashAmount RUB = " +
            "${(cashAmount * 75.47).toFloat()} ${this.currencyCode}\t")
}