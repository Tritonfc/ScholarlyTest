package com.tobe.scholarlytest.data.localDataSource

import androidx.room.Embedded
import androidx.room.Relation

data class ContentTypeAndContent(
    @Embedded val contentType: ContentTypeEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "contentTypeId"
    )
    val content: ContentsEntity
)
