package com.tobe.scholarlytest.domain

import com.tobe.scholarlytest.data.localDataSource.models.CbtQuestion
import com.tobe.scholarlytest.data.localDataSource.models.Companies
import com.tobe.scholarlytest.data.localDataSource.models.ResponseDataModel
import com.tobe.scholarlytest.data.localDataSource.models.TextContent
import com.tobe.scholarlytest.data.remoteDataSource.Country
import com.tobe.scholarlytest.data.remoteDataSource.api.CountriesResponse

data class Result(
    val text : TextContent,
    val imageCountry: String,
    val tableContent : ResponseDataModel<Companies>,
    val cbtQuestion: ResponseDataModel<CbtQuestion>,
    val unorderedList : CountriesResponse
)
