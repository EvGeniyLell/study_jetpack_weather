//package com.evg.weather.remote
//
//import com.evg.weather.remote.dto.CityDto
//import retrofit2.Response
//import retrofit2.http.GET
//import retrofit2.http.Query
//
//
//interface ApiService {
//    @GET("/geo/1.0/direct")
//    suspend fun getCities(
//        @Query("q") q: String,
//        @Query("limit") limit: Int = RemoteModule.PAGE_SIZE,
//        @Query("appid") appId: String = RemoteModule.APP_ID
//    ): Response<List<CityDto>>
//}
//
//
//
//
