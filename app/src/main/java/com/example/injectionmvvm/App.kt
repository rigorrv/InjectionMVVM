package com.example.injectionmvvm

import android.app.Application
import com.example.injectionmvvm.component.DaggerRigoComponent
import com.example.injectionmvvm.component.RigoComponent
import com.example.injectionmvvm.module.RigoModule

class App : Application(){

    private lateinit var rigoComponent: RigoComponent

    override fun onCreate() {
        super.onCreate()

        rigoComponent = DaggerRigoComponent.builder().rigoModule(RigoModule()).build()
    }
    fun getComponent() = rigoComponent

}