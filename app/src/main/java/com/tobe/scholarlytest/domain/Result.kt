package com.tobe.scholarlytest.domain

import com.tobe.scholarlytest.data.localDataSource.models.CbtQuestion
import com.tobe.scholarlytest.data.localDataSource.models.Companies
import com.tobe.scholarlytest.data.localDataSource.models.ResponseDataModel
import com.tobe.scholarlytest.data.localDataSource.models.TextContent
import com.tobe.scholarlytest.data.remoteDataSource.Country
import com.tobe.scholarlytest.data.remoteDataSource.api.CountriesResponse



data class Result(
    val text : TextContent? = null,
    val imageCountry: String ="",
    val tableContent : ResponseDataModel<Companies>? = null,
    val cbtQuestion: ResponseDataModel<CbtQuestion>? = null,
    val unorderedList : CountriesResponse? = null
)
