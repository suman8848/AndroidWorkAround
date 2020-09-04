package com.example.androidpractise.stagezerowithoutdagger

import android.app.Application
import com.example.androidpractise.stagethreewithdagger.data.local.DatabaseService
import com.example.androidpractise.stagethreewithdagger.data.remote.NetworkService
import com.example.androidpractise.stagethreewithdagger.di.component.ApplicationComponent
import com.example.androidpractise.stagethreewithdagger.di.component.DaggerApplicationComponent
import com.example.androidpractise.stagethreewithdagger.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent:ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService


    //changes of stageonewithoutdagger
//    lateinit var networkService: NetworkService
//    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        //changes of stageonewithoutdagger
//        networkService = NetworkService(this, "SOME_API_KEY")
//        databaseService = DatabaseService(this, "dummy_db", 1)

//        new changes
//        DependencyComponent.inject(this)

        //Dagger Implementation
        getDependencies()

    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}