package com.sho.masegi.tutorial

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.sho.masegi.tutorial.di.AppComponent
import com.sho.masegi.tutorial.di.DaggerAppComponent

class MainApplication: Application() {
    fun appComponent(): AppComponent =
        DaggerAppComponent
            .builder()
            .context(applicationContext)
            .build()

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}