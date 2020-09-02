package com.example.androidpractise.stagezerowithoutdagger

import android.app.Application
import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.DatabaseService
import com.example.androidpractise.stagetwowithoutdaggerimproved.data.local.NetworkService
import com.example.androidpractise.stagetwowithoutdaggerimproved.di.DependencyComponent

class MyApplication : Application() {

    //changes of stageonewithoutdagger
    lateinit var networkService: NetworkService
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        //changes of stageonewithoutdagger
//        networkService = NetworkService(this, "SOME_API_KEY")
//        databaseService = DatabaseService(this, "dummy_db", 1)

//        new changes
        DependencyComponent.inject(this)
    }
}