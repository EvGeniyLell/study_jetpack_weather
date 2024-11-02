//package com.evg.weather.remote
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//
//
//@Module
//@InstallIn(SingletonComponent::class)
//object RemoteModule {
//    const val APP_ID: String = "e7bd95961b5eea99e8d9ef16777d63a2"
//    const val PAGE_SIZE: Int = 20
//    const val HOST: String = "https://api.openweathermap.org/"
//
//    @Provides
//    @Singleton
//    fun provideApiService(): ApiService {
//        val retrofit = Retrofit.Builder()
//            .baseUrl(HOST)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        return retrofit.create(ApiService::class.java)
//    }
//}