package com.tobe.scholarlytest.di

import android.app.Application
import androidx.room.Room
import com.tobe.scholarlytest.data.localDataSource.ContentDao
import com.tobe.scholarlytest.data.localDataSource.ContentDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        app: Application,
        ) = Room.databaseBuilder(app, ContentDatabase::class.java, "content_database")
        .createFromAsset("scholarly.db")
        .build()


    @Provides
    @Singleton
    fun provideDao(db: ContentDatabase): ContentDao {
        return db.getContentDao()
    }
}