package Domain.Model

import Data.Remote.DTO.Country

data class CountryModel(
    val name:String,
    val flag:String
)

fun CountryModel.toCountries():Country{
    return Country(
        name = name,
        flag = flag
    )
}
