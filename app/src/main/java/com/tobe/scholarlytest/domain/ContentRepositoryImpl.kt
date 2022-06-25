package com.tobe.scholarlytest.domain

import com.tobe.scholarlytest.core.DispatcherProvider
import com.tobe.scholarlytest.data.localDataSource.LocalDataRepository
import com.tobe.scholarlytest.data.remoteDataSource.RemoteDataRepository
import kotlinx.coroutines.withContext

class ContentRepositoryImpl(
    private val localDataRepository: LocalDataRepository,
    private val remoteDataRepository: RemoteDataRepository,
    private val dispatcherProvider: DispatcherProvider
) : ContentRepository {


    override suspend fun getResult(): Result {
        val text = withContext(dispatcherProvider.io){
            localDataRepository.getTextContent()
        }

        val cbtQuestion = withContext(dispatcherProvider.io){
            localDataRepository.getCbtContent()
        }

        val tableItems = withContext(dispatcherProvider.io){
            localDataRepository.getTableContent()
        }

        val countries =withContext(dispatcherProvider.io){
            remoteDataRepository.getCountries()
        }

        val countriesImage = withContext(dispatcherProvider.io){
          val country =  countries.data.random()
            country.countryFlag
        }
        return Result(text,countriesImage,tableItems,cbtQuestion,countries)
    }
}