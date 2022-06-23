package com.tobe.scholarlytest.data.localDataSource.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class TextContent(
    @SerializedName("title") val title : Title,
    @SerializedName("body") val body : Body
){

    @Parcelize
    data class Title(

        @SerializedName("text") val text : String
    ): Parcelable

    @Parcelize
    data class Body(

        @SerializedName("text") val text : String
    ): Parcelable
}
