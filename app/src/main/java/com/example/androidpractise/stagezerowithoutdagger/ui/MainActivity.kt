package com.example.androidpractise.stagezerowithoutdagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androidpractise.R

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize MainViewModel
        mainViewModel = MainViewModel(this.applicationContext)

        val tvData: TextView = findViewById(R.id.tvData)
        tvData.text = mainViewModel.getSomeData()
    }
}