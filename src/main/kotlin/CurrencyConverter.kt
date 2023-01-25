interface CurrencyConverter {

    val currencyNode: String

    fun convertRub(cashAmount: Double): Double
}