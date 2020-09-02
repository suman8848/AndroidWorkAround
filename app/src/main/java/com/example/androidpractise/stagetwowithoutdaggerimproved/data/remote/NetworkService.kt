package com.example.androidpractise.stagetwowithoutdaggerimproved.data.local

import android.content.Context

class NetworkService(context: Context, apiKey: String) {
    fun getDummyData() = "NETWORK_DUMMY_DATA"
}