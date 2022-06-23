package com.tobe.scholarlytest.data.localDataSource.models

import com.google.gson.annotations.SerializedName




data class CbtQuestion(

    @SerializedName("question") val question : String,
    @SerializedName("option") val option : Option,
    @SerializedName("answer_id") val answer_id : Int,
    @SerializedName("explanation") val explanation : String,
)
