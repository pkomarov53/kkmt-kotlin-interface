class UsdConverter: CurrencyConverter {

    override val currencyCode: String = "USD"

    override fun convertRub(cashAmount: Double) = println("$cashAmount RUB = " +
            "${(cashAmount * 69.32).toFloat()} ${this.currencyCode}\t")
}