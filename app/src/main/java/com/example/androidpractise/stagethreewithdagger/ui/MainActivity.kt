package com.example.androidpractise.stagethreewithdagger.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidpractise.R
import com.example.androidpractise.stagethreewithdagger.di.component.DaggerActivityComponent
import com.example.androidpractise.stagethreewithdagger.di.module.ActivityModule
import com.example.androidpractise.stagezerowithoutdagger.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)
        val tvData:TextView = findViewById(R.id.tvData)
        tvData.text = mainViewModel.getSomeData()
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }

}