package com.mickeycj.data

import io.reactivex.Maybe
import io.reactivex.Single

import com.mickeycj.domain.models.*

import com.mickeycj.data.models.*

/**
 * Object for providing mock data.
 */
object MockData {

    private val _currencyData = CurrencyData(
        "USD",
        "United States dollar",
        "$"
    )
    private val _languageData = LanguageData(
        "en",
        "eng",
        "English",
        "English"
    )
    private val _translationsData = TranslationsData(
        "Vereinigte Staaten von Amerika",
        "Estados Unidos",
        "États-Unis",
        "アメリカ合衆国",
        "Stati Uniti D'America",
        "Estados Unidos",
        "Estados Unidos",
        "Verenigde Staten",
        "Sjedinjene Američke Države",
        "ایالات متحده آمریکا"
    )
    private val _regionalBlocData = RegionalBlocData(
        "NAFTA",
        "North American Free Trade Agreement",
        listOf(),
        listOf(
            "Tratado de Libre Comercio de América del Norte",
            "Accord de Libre-échange Nord-Américain"
        )
    )
    private val _countryData = CountryData(
        "United States of America",
        listOf(".us"),
        "US",
        "USA",
        listOf("1"),
        "Washington, D.C.",
        listOf(
            "US",
            "USA",
            "United States of America"
        ),
        "Americas",
        "Northern America",
        323947000,
        listOf(
            38,
            -97
        ),
        "American",
        9629091,
        48.0f,
        listOf(
            "UTC-12:00",
            "UTC-11:00",
            "UTC-10:00",
            "UTC-09:00",
            "UTC-08:00",
            "UTC-07:00",
            "UTC-06:00",
            "UTC-05:00",
            "UTC-04:00",
            "UTC+10:00",
            "UTC+12:00"
        ),
        listOf(
            "CAN",
            "MEX"
        ),
        "United States",
        "840",
        listOf(_currencyData),
        listOf(_languageData),
        _translationsData,
        "https://restcountries.eu/data/usa.svg",
        listOf(_regionalBlocData),
        "USA"
    )

    private val _currency = Currency(
        "USD",
        "United States dollar",
        "$"
    )
    private val _language = Language(
        "English",
        "English",
        "eng"
    )
    private val _country = Country(
        "https://restcountries.eu/data/usa.svg",
        "United States of America",
        "United States",
        "USA",
        "Washington, D.C.",
        "American",
        listOf(_language),
        listOf(_currency),
        listOf(
            "CAN",
            "MEX"
        ),
        "Americas",
        39.0f,
        -97.0f,
        9629091f,
        323947000,
        48.0f
    )

    val countryData: CountryData
        get() {
            return _countryData
        }
    val currencyData: CurrencyData
        get() {
            return _currencyData
        }
    val languageData: LanguageData
        get() {
            return _languageData
        }

    val country: Country
        get() {
            return _country
        }
    val currency: Currency
        get() {
            return _currency
        }
    val language: Language
        get() {
            return _language
        }

    val countriesFromApi: Single<List<CountryData>>
        get() {
            return Single.just(List(3) { _countryData })
        }
    val countryFromApi: Maybe<CountryData>
        get() {
            return Maybe.just(_countryData)
        }
}
