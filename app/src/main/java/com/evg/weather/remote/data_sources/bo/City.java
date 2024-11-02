package com.evg.weather.remote.data_sources.bo;

public class City {
    final Float lat;
    final Float lon;
    final String name;
    final String country;
    final String state;

    public City(Float lat, Float lon, String name, String country, String state) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.country = country;
        this.state = state;
    }
}
