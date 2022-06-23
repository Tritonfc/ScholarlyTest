package com.tobe.scholarlytest.data.localDataSource

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "content_types")
data class ContentTypeEntity(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "content_type") val contentType : String,
)
