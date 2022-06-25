package com.tobe.scholarlytest.data.localDataSource

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(tableName = "contents")
data class ContentsEntity(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "content")
    val contents : String,
    @ColumnInfo(name = "content_type_id")
    val contentTypeId : Int,
)
