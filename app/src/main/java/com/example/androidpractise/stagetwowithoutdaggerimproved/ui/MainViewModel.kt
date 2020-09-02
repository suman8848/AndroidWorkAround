package com.example.androidpractise.stagetwowithoutdaggerimproved.data.local


class MainViewModel(private val databaseService: DatabaseService, private val networkService: NetworkService) {

    fun getSomeData() = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"
}