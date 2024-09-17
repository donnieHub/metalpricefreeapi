package org.metalpricefreeapi

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide.open
import org.metalpricefreeapi.pages.InvestFundsPage
import org.metalpricefreeapi.pages.Page
import org.metalpricefreeapi.pages.RbcRuPage
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities


fun main() {
    val page: Page = RbcRuPage()
    Configuration.pageLoadTimeout = 30 * 1000
    Configuration.pageLoadStrategy = "none";

    open(page.url)
    val goldPrice = page.getGoldPrice()
    println(goldPrice)
}