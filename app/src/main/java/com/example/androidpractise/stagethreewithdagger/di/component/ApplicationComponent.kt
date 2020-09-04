package com.example.androidpractise.stagethreewithdagger.di.component

import android.content.Context
import com.example.androidpractise.stagethreewithdagger.data.local.DatabaseService
import com.example.androidpractise.stagethreewithdagger.data.remote.NetworkService
import com.example.androidpractise.stagethreewithdagger.di.module.ApplicationModule
import com.example.androidpractise.stagethreewithdagger.di.qualifier.ApplicationContext
import com.example.androidpractise.stagezerowithoutdagger.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application:MyApplication)

    @ApplicationContext
    fun exposeContext():Context
    fun exposeDatabaseService():DatabaseService
    fun exposeNetworkService():NetworkService
}