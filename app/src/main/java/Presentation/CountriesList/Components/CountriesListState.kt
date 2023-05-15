package Presentation.CountriesList.Components

import Data.Remote.DTO.Country

data class CountriesListState(
    val isLoading: Boolean = false,
    val Countries: List<Country> = emptyList(),
    val error: String = ""
)
