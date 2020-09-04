package com.example.androidpractise.stagethreewithdagger.di.module

import android.app.Activity
import android.content.Context
import com.example.androidpractise.stagethreewithdagger.di.qualifier.ActivityContext
import com.example.androidpractise.stagethreewithdagger.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private  val activity:MainActivity){

    @ActivityContext
    @Provides
    fun providesContext(): Context = activity

}