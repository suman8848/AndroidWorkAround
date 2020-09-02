package com.example.androidpractise.stagetwowithoutdaggerimproved.data.local

import android.app.Application
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidpractise.R
import com.example.androidpractise.stagetwowithoutdaggerimproved.di.DependencyComponent
import com.example.androidpractise.stagezerowithoutdagger.MyApplication

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize MainViewModel
//        var myApplication = application as MyApplication
//        mainViewModel = MainViewModel(myApplication.databaseService, myApplication.networkService)
        //New changes
        DependencyComponent.inject(this)

        var tvData: TextView = findViewById(R.id.tvData)
        tvData.text = mainViewModel.getSomeData()


    }
}