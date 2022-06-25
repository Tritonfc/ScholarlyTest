package com.tobe.scholarlytest.domain

interface ContentRepository {
    suspend fun getResult(): Result

}