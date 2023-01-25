object Converters {
    private val codeList = listOf(EuroConverter(), UsdConverter())

    fun get(currencyCode: String): CurrencyConverter {
        for (i in codeList.indices)
            if (codeList[i].currencyCode == currencyCode.uppercase())
            return codeList[i] // Возвращаем объект-конвертер из нашего списка, если нашли его по коду валюты

        // Иначе возвращаем объект с нашей неизвестной валютой
        return object: CurrencyConverter {
            override val currencyCode: String
                get() = currencyCode.uppercase()
            override fun convertRub(cashAmount: Double) = println("Валюта $currencyCode " +
                    "не найдена в нашей базе данных.\t")
        }
    }
}