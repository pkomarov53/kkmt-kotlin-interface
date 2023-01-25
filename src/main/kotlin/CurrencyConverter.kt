interface CurrencyConverter {

    val currencyCode: String

    fun convertRub(cashAmount: Double)
}