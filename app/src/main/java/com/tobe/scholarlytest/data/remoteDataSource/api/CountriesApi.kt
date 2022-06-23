package com.tobe.scholarlytest.data.remoteDataSource.api

import retrofit2.http.GET

interface CountriesApi {

    companion object{
        const val BASE_URL = "https://partner.scholarly.africa"
    }


    @GET("util/api/v1/geo-region/countries")
    suspend fun getCountries():CountriesResponse
}