package com.sunnyweahter.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val token = "mrU653t3lXtHmtnL"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}