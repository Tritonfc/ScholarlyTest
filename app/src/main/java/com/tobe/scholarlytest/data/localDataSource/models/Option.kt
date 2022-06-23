package com.tobe.scholarlytest.data.localDataSource.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Option(

    @SerializedName("0") val option1 : String,
    @SerializedName("1") val option2 : String,
    @SerializedName("2") val option3 : String,
    @SerializedName("3") val option4 : String
): Parcelable
