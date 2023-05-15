package DI
import Common.Constants
import Data.Remote.CountriesApiService
import Data.Repository.CountriesRepositoryImplementions
import Domain.Repository.CountriesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object AppModule {

    @Provides
    @Singleton

    fun provideCountriesApi(): CountriesApiService{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CountriesApiService::class.java)
    }

    @Provides
    @Singleton

    fun provideCountriesRepository(api:CountriesApiService):CountriesRepository{
        return CountriesRepositoryImplementions(api)
    }
}

