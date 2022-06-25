package com.tobe.scholarlytest.data.localDataSource

import com.tobe.scholarlytest.data.Parser
import com.tobe.scholarlytest.data.localDataSource.models.CbtQuestion
import com.tobe.scholarlytest.data.localDataSource.models.Companies
import com.tobe.scholarlytest.data.localDataSource.models.ResponseDataModel
import com.tobe.scholarlytest.data.localDataSource.models.TextContent
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class JsonParser @Inject constructor(val parser: Parser) {
    suspend fun getCompaniesContent(response : String): ResponseDataModel<Companies> =
        parser.parse(response)

    suspend fun getTextContent(response : String): TextContent =
        parser.parse(response)

    suspend fun getCbtContent(response : String): ResponseDataModel<CbtQuestion>  =
        parser.parse(response)


}