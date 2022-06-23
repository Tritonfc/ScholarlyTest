package com.tobe.scholarlytest.data.remoteDataSource

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("country_flag_url") val countryFlag: String,
)
