package com.awesomeapp.module_1_120.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_120.Viewmodel120_1
import com.awesomeapp.module_1_120.Activity120_2
import com.awesomeapp.module_1_120.Activity120_3
import com.awesomeapp.module_1_120.Fragment120_4
import com.awesomeapp.module_1_120.Repository120_5
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_120.Service120_7
import com.awesomeapp.module_1_120.Worker120_8
import com.awesomeapp.module_1_120.Usecase120_9
import com.awesomeapp.module_1_120.Model120_11
import com.awesomeapp.module_1_120.Model120_12
import com.awesomeapp.module_1_120.Activity120_13
import com.awesomeapp.module_1_120.Model120_15
import com.awesomeapp.module_1_120.Activity120_16
import com.awesomeapp.module_1_120.Model120_18
import com.awesomeapp.module_1_120.Activity120_19
import com.awesomeapp.module_1_120.Model120_21
import com.awesomeapp.module_1_120.Activity120_22
import com.awesomeapp.module_1_120.Model120_24
import com.awesomeapp.module_1_120.Activity120_25
import com.awesomeapp.module_1_120.Model120_27
import com.awesomeapp.module_1_120.Activity120_28
import com.awesomeapp.module_1_120.Model120_30
import com.awesomeapp.module_1_120.Activity120_31
import com.awesomeapp.module_1_120.Model120_33
import com.awesomeapp.module_1_120.Activity120_34
import com.awesomeapp.module_1_120.Model120_36
import com.awesomeapp.module_1_120.Activity120_37
import com.awesomeapp.module_1_120.Model120_39
import com.awesomeapp.module_1_120.Activity120_40
import com.awesomeapp.module_1_120.Model120_42

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api64_6 = Api64_6(),
        api1: Api68_6 = Api68_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}