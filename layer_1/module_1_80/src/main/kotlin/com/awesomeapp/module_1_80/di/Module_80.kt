package com.awesomeapp.module_1_80.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_80.Viewmodel80_1
import com.awesomeapp.module_1_80.Activity80_2
import com.awesomeapp.module_1_80.Activity80_3
import com.awesomeapp.module_1_80.Fragment80_4
import com.awesomeapp.module_1_80.Repository80_5
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_80.Service80_7
import com.awesomeapp.module_1_80.Worker80_8

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(): Repository80_5 {
        return Repository80_5()
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}