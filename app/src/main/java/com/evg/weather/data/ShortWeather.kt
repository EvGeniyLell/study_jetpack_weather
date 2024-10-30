package com.evg.weather.data


data class ShortWeather(
    val title: String,
    val subtitle: String,
    val conditions: String,
    val currentTemperature: UInt,
    val maxTemperature: UInt,
    val minTemperature: UInt,
)