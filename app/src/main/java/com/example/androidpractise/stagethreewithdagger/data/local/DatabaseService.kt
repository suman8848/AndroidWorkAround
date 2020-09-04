package com.example.androidpractise.stagethreewithdagger.data.local

import android.content.Context
import com.example.androidpractise.stagethreewithdagger.di.qualifier.ApplicationContext
import com.example.androidpractise.stagethreewithdagger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService  @Inject constructor (@ApplicationContext private val context: Context, @DatabaseInfo private var databaseName: String, @DatabaseInfo private var databaseVersion: Int) {
    fun getDummyData() = "DATABASE DUMMY DATA"
}