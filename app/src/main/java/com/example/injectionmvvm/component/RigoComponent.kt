package com.example.injectionmvvm.component

import com.example.injectionmvvm.MainActivity
import com.example.injectionmvvm.module.RigoModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RigoModule::class])
interface RigoComponent {

    fun inject(mainActivity: MainActivity)

}