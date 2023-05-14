package Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object CountriesInstance {
    val api:CountriesApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://restcountries.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CountriesApiService::class.java)
    }
}