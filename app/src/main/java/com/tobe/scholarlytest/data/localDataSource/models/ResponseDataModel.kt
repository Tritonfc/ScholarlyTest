package com.tobe.scholarlytest.data.localDataSource.models

data class ResponseDataModel<T>(

    val title: String,
    val body: T,

)
