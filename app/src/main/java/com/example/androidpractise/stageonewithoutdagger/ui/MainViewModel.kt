package com.example.androidpractise.stageonewithoutdagger.ui

import com.example.androidpractise.stageonewithoutdagger.data.local.DatabaseService
import com.example.androidpractise.stageonewithoutdagger.data.remote.NetworkService

class MainViewModel(private val databaseService: DatabaseService, private val networkService: NetworkService) {

    fun getSomeData() = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"
}