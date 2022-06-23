package com.tobe.scholarlytest.data.localDataSource.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class Companies(

    @SerializedName("header") val header : List<String>,
    @SerializedName("rows") val rows : List<List<String>>
)



