package com.example.androidpractise.stageonewithoutdagger.data.remote

import android.content.Context

class NetworkService(context: Context, apiKey: String) {
    fun getDummyData() = "NETWORK_DUMMY_DATA"
}