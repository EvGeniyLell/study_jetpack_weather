package com.evg.weather.remote.data_sources.open_weather_map.dto;

public class CityDto {
    final Float lat;
    final Float lon;
    final String name;
    final String country;
    final String state;

    public CityDto(Float lat, Float lon, String name, String country, String state) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.country = country;
        this.state = state;
    }
}
