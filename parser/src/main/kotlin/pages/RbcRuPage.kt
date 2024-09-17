package org.metalpricefreeapi.pages

import com.codeborne.selenide.Selenide.element

class RbcRuPage : Page {

    override val url = "https://www.rbc.ru/quote/ticker/101039"

    companion object Locators {
        const val GOLD_PRICE = "#maincontent .chart__info .chart__info__sum"
    }

    private val goldPriceElement = element(GOLD_PRICE)

    override fun getGoldPrice(): Double? {
        val goldPriceText = goldPriceElement.text()
        val normalizeGoldPrice = goldPriceText
            .removePrefix("$")
            .replace(" ", "")
            .replace(",", ".")
        return normalizeGoldPrice.removePrefix("$").toDoubleOrNull()
    }

}