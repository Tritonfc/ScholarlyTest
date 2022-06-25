package com.tobe.scholarlytest.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.reflect.Type
import javax.inject.Inject

class Parser @Inject constructor(private val context: Context, val gson: Gson) {

    inline fun <reified T> type(): Type = object : TypeToken<T>() {}.type

    inline fun <reified T> parse(name: String): T {
        return gson.fromJson(name, type<T>())
    }


}
