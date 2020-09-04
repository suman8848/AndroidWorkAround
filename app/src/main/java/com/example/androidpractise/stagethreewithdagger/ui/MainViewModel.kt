package com.example.androidpractise.stagethreewithdagger.ui

import com.example.androidpractise.stagethreewithdagger.data.local.DatabaseService
import com.example.androidpractise.stagethreewithdagger.data.remote.NetworkService
import com.example.androidpractise.stagethreewithdagger.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {
    fun getSomeData() = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"
}