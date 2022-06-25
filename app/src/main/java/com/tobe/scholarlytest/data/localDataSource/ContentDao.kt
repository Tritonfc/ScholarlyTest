package com.tobe.scholarlytest.data.localDataSource

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction


@Dao
interface ContentDao {


    @Transaction
    @Query("SELECT * FROM content_types ")
    fun getContentTypesandContent(): List<ContentTypeAndContent>
}