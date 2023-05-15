package Data.Remote

import Data.Remote.DTO.Country
import Data.Remote.DTO.CountryDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CountriesApiService {
    @GET("v3.1/all")


    suspend fun getCountries(): List<Country>


    @GET("v3.1/alpha/[countryCode/cca2]")

    suspend fun getCountriesDetails(@Path("cca2")cca2: String): Response<CountryDetails>
}