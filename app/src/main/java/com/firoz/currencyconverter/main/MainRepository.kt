package com.firoz.currencyconverter.main

import com.firoz.currencyconverter.data.models.CurrencyResponse
import com.firoz.currencyconverter.utils.Resource

interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}