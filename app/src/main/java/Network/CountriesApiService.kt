package Network

import Model.Country
import retrofit2.http.GET

interface CountriesApiService {
    @GET("v3.1/all")


    suspend fun getCountries(): List<Country>
}