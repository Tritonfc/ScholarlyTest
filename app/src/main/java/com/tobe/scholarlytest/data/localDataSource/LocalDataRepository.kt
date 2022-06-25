package com.tobe.scholarlytest.data.localDataSource

import com.tobe.scholarlytest.data.localDataSource.models.CbtQuestion
import com.tobe.scholarlytest.data.localDataSource.models.Companies
import com.tobe.scholarlytest.data.localDataSource.models.ResponseDataModel
import com.tobe.scholarlytest.data.localDataSource.models.TextContent
import javax.inject.Inject

class LocalDataRepository  @Inject constructor(private val contentDao: ContentDao, private val jsonParser: JsonParser) {


   suspend fun getTextContent(): TextContent{
       val content = contentDao.getContentTypesandContent()[0].content.contents

       return jsonParser.getTextContent(content)
   }

    suspend fun getTableContent(): ResponseDataModel<Companies>{
        val content = contentDao.getContentTypesandContent()[1].content.contents

        return jsonParser.getCompaniesContent(content)
    }

    suspend fun getCbtContent(): ResponseDataModel<CbtQuestion>{
        val content = contentDao.getContentTypesandContent()[2].content.contents

        return jsonParser.getCbtContent(content)
    }


}