package com.tobe.scholarlytest.data.localDataSource

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [
        ContentsEntity :: class,
        ContentTypeEntity :: class


    ],
    version = 1
)
abstract class ContentDatabase : RoomDatabase() {
}