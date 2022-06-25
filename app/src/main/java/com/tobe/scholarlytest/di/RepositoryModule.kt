package com.tobe.scholarlytest.di

import com.tobe.scholarlytest.core.DispatcherProvider
import com.tobe.scholarlytest.data.localDataSource.LocalDataRepository
import com.tobe.scholarlytest.data.remoteDataSource.RemoteDataRepository
import com.tobe.scholarlytest.domain.ContentRepository
import com.tobe.scholarlytest.domain.ContentRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides

    @Singleton
    fun provideRepository(
        localDataRepository: LocalDataRepository,
        remoteDataRepository: RemoteDataRepository,
        provider: DispatcherProvider

    ): ContentRepository {
        return ContentRepositoryImpl(
            localDataRepository = localDataRepository,
            remoteDataRepository = remoteDataRepository,
            dispatcherProvider = provider,
            )
    }
}