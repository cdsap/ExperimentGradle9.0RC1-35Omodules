package com.awesomeapp.module_2_184.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_184.Viewmodel184_1
import com.awesomeapp.module_2_184.Activity184_2
import com.awesomeapp.module_2_184.Activity184_3
import com.awesomeapp.module_2_184.Fragment184_4
import com.awesomeapp.module_2_184.Repository184_5
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_2_184.Api184_6

@Module
@InstallIn(SingletonComponent::class)
object Module_184 {
    @Provides
    @Singleton
    fun provideRepository184_5(
        api0: Api80_6 = Api80_6()
    ): Repository184_5 {
        return Repository184_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi184_6(): Api184_6 {
        return Api184_6()
    }
}