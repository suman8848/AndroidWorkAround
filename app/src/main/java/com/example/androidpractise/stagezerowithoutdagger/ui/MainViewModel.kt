package com.example.androidpractise.stagezerowithoutdagger.ui

import android.content.Context
import com.example.androidpractise.stagezerowithoutdagger.data.local.DatabaseService
import com.example.androidpractise.stagezerowithoutdagger.data.remote.NetworkService

class MainViewModel(context: Context) {
    private var databaseService: DatabaseService = DatabaseService(context)
    private var networkService: NetworkService = NetworkService(context)

    fun getSomeData() = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"
}