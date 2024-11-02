package com.evg.weather.remote.data_sources.open_weather_map


import com.evg.weather.remote.data_sources.DataSource
import com.evg.weather.remote.data_sources.WeatherApi
import com.evg.weather.remote.data_sources.open_weather_map.dto.CityDto
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OpenWeatherDataSource: DataSource {
    internal const val APP_ID: String = "e7bd95961b5eea99e8d9ef16777d63a2"
    internal const val PAGE_SIZE: Int = 20
    private const val HOST: String = "https://api.openweathermap.org/"

    @Provides
    @Singleton
    override fun provideApi(): OpenWeatherApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(HOST)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(OpenWeatherApi::class.java)
    }
}

interface OpenWeatherApi: WeatherApi {
    @GET("/geo/1.0/direct")
    suspend fun getCities(
        @Query("q") q: String,
        @Query("limit") limit: Int = OpenWeatherDataSource.PAGE_SIZE,
        @Query("appid") appId: String = OpenWeatherDataSource.APP_ID
    ): Response<List<CityDto>>
}