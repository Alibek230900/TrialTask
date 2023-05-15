package Data.Remote.DTO

import Domain.Model.Currency
import Domain.Model.Flags

data class CountryDetails(
    val name: String,
    val flags: Flags,
    val capital: String,
    val currencies: List<Currency>,
    val continents: List<String>,
    val area: Double,
    val region: String,
    val timezones: List<String>
)

data class Flags(
    val png: String
)

data class Currency(
    val name: String
)