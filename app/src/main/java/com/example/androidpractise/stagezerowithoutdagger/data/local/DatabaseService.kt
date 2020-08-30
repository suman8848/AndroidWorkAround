package com.example.androidpractise.stagezerowithoutdagger.data.local

import android.content.Context

class DatabaseService(private  var context: Context) {
    private var databaseName: String = "dummy_db"
    private var version:Int = 0
    init {
        version = 1
    }

    fun getDummyData() = "DATABASE_DUMMY_DATA"
}