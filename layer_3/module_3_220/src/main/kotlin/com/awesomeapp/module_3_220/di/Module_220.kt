package com.awesomeapp.module_3_220.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_220.Viewmodel220_1
import com.awesomeapp.module_3_220.Activity220_2
import com.awesomeapp.module_3_220.Activity220_3
import com.awesomeapp.module_3_220.Fragment220_4
import com.awesomeapp.module_3_220.Repository220_5
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_220.Service220_7
import com.awesomeapp.module_3_220.Worker220_8
import com.awesomeapp.module_3_220.Model220_10
import com.awesomeapp.module_3_220.Model220_11

@Module
@InstallIn(SingletonComponent::class)
object Module_220 {
    @Provides
    @Singleton
    fun provideRepository220_5(
        api0: Api152_6 = Api152_6()
    ): Repository220_5 {
        return Repository220_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi220_6(): Api220_6 {
        return Api220_6()
    }
}