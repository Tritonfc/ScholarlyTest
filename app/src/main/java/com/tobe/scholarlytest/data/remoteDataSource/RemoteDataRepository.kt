package com.tobe.scholarlytest.data.remoteDataSource

import com.tobe.scholarlytest.data.remoteDataSource.api.CountriesApi
import com.tobe.scholarlytest.data.remoteDataSource.api.CountriesResponse
import javax.inject.Inject

class RemoteDataRepository @Inject constructor(private val countriesApi: CountriesApi) {

    suspend fun getCountries():CountriesResponse{
        return countriesApi.getCountries()
    }
}