package com.example.androidpractise.stagethreewithdagger.di.module

import android.content.Context
import com.example.androidpractise.stagethreewithdagger.di.qualifier.ApplicationContext
import com.example.androidpractise.stagethreewithdagger.di.qualifier.DatabaseInfo
import com.example.androidpractise.stagethreewithdagger.di.qualifier.NetworkInfo
import com.example.androidpractise.stagezerowithoutdagger.MyApplication
import dagger.Module
import dagger.Provides

@Module
 class ApplicationModule(private val myApplication: MyApplication) {

    @ApplicationContext
    @Provides
    fun providesContext():Context = myApplication

    @DatabaseInfo
    @Provides
    fun providesDatabaseName() = "dummy_db"

    @DatabaseInfo
    @Provides
    fun providesDatabaseVersion() = 1

    @NetworkInfo
    @Provides
    fun providesApiKey() = "SOME_API_KEY"

}