package com.tobe.scholarlytest.data.remoteDataSource.api

import com.tobe.scholarlytest.data.remoteDataSource.Country

data class CountriesResponse(
    val status : String,
    val data : List<Country>,
    val message : String
)
