package org.metalpricefreeapi.pages

interface Page {
    val url: String

    fun getGoldPrice(): Double?

}