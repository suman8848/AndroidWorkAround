package com.example.androidpractise.stageonewithoutdagger.ui

import android.app.Application
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidpractise.R
import com.example.androidpractise.stagezerowithoutdagger.MyApplication

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize MainViewModel
        var myApplication = application as MyApplication
        mainViewModel = MainViewModel(myApplication.databaseService, myApplication.networkService)

        var tvData : TextView = findViewById(R.id.tvData)
        tvData.text = mainViewModel.getSomeData()


    }
}