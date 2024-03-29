package com.sho.masegi.tutorial

import android.app.Application
import com.sho.masegi.tutorial.di.AppComponent
import com.sho.masegi.tutorial.di.DaggerAppComponent

class MainApplication: Application() {
    fun appComponent(): AppComponent =
        DaggerAppComponent
            .builder()
            .context(applicationContext)
            .build()
}