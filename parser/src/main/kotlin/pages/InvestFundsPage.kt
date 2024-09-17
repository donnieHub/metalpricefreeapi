package org.metalpricefreeapi.pages

import com.codeborne.selenide.Selenide.element

class InvestFundsPage : Page {

    override val url = "https://investfunds.ru/indexes/224/"
    companion object Locators {
        const val GOLD_PRICE = ".widget_roll_wrapper .widget_price .price"
    }

    private val goldPriceElement = element(GOLD_PRICE)

    override fun getGoldPrice(): Double? {
        val goldPriceText = goldPriceElement.text()
        return goldPriceText.toDoubleOrNull()
    }



}