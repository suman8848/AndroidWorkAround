package com.example.androidpractise.stagezerowithoutdagger.data.remote

import android.content.Context

class NetworkService(private var context: Context) {
    private var apiKey:String = "SOME_API_KEY"
    fun getDummyData() = "NETWORK_DUMMY_DATA"
}