package com.example.androidpractise.stagetwowithoutdaggerimproved.data.local

import android.content.Context
class DatabaseService(
    private var context: Context,
    private var databaseName: String,
    private var databaseVersion: Int
) {
    fun getDummyData() = "DATABASE_DUMMY_DATA"
}

