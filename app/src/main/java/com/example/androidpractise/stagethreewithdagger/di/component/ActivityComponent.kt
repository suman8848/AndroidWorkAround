package com.example.androidpractise.stagethreewithdagger.di.component

import com.example.androidpractise.stagethreewithdagger.di.module.ActivityModule
import com.example.androidpractise.stagethreewithdagger.di.scope.ActivityScope
import com.example.androidpractise.stagethreewithdagger.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent {
    fun inject(activity:MainActivity)
}