package com.example.androidpractise.stagethreewithdagger.data.remote

import android.content.Context
import com.example.androidpractise.stagethreewithdagger.di.qualifier.ApplicationContext
import com.example.androidpractise.stagethreewithdagger.di.qualifier.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    @ApplicationContext private val context: Context,
    @NetworkInfo private var apiKey: String
) {
    fun getDummyData() = "NETWORK_DUMMY_DATA"
}