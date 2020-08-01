package com.example.injectionmvvm.module

import com.example.injectionmvvm.models.Arm
import com.example.injectionmvvm.models.Body
import com.example.injectionmvvm.models.Head
import com.example.injectionmvvm.models.Leg
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class RigoModule {

    @Provides
    @Singleton
    fun provideHead() = Head("Cabeza")

    @Provides
    @Singleton
    @Named("armR")
    fun provideArmR() = Arm("Brazo Derecho")

    @Provides
    @Singleton
    @Named("armL")
    fun provideArmL() = Arm("Brazo Izquerdo")


    @Provides
    @Singleton
    @Named("legR")
    fun provideLegR() = Leg("Pierna Derecho")

    @Provides
    @Singleton
    @Named("legL")
    fun provideLegL() = Leg("Pierna Izquierda")

    @Provides
    @Singleton
    fun provideBody(head: Head,
                    @Named("armR") armR : Arm,
                    @Named("armL") armL : Arm,
                    @Named("legR") legR : Leg,
                    @Named("legL") legL : Leg

             )= Body(head,armR,armL,legR,legL)
}