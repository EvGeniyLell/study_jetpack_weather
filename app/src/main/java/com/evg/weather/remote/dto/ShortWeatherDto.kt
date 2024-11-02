package com.evg.weather.remote.dto

data class ShortWeatherDto(
    val title: String,
    val subtitle: String,
    val conditions: String,
    val currentTemperature: UInt,
    val maxTemperature: UInt,
    val minTemperature: UInt,
)