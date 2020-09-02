package com.example.androidpractise.stagetwowithoutdaggerimproved.di

import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.DatabaseService
import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.MainActivity
import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.MainViewModel
import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.NetworkService
import com.example.androidpractise.stagezerowithoutdagger.MyApplication

class DependencyComponent {
    companion object {
        fun inject(application: MyApplication) {
            application.networkService = NetworkService(application, "SOME_API_KEY")
            application.databaseService = DatabaseService(application, "dummy_db", 1)
        }
        fun inject(mainActivity: MainActivity){
            val myApplication: MyApplication = mainActivity.application as MyApplication
            mainActivity.mainViewModel = MainViewModel(myApplication.databaseService, myApplication.networkService)
        }
    }
}