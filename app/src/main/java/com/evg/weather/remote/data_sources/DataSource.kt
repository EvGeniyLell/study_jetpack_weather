package com.evg.weather.remote.data_sources

import com.evg.weather.remote.data_sources.bo.*
import retrofit2.Response


interface DataSource {

    fun provideApi(): WeatherApi

}

interface WeatherApi {

    suspend fun getCities(
        q: String,
    ): Response<List<City>>

}