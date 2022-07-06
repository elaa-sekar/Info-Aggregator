package com.elaa.infoaggregator

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class InfoAggregatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initAllDependencies()
        initActivityLifeCycleCallback()
    }

    private fun initActivityLifeCycleCallback() {

    }

    private fun initAllDependencies() {

    }
}