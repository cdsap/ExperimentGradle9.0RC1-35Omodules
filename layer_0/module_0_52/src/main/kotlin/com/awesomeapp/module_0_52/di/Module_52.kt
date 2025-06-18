package com.awesomeapp.module_0_52.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_52.Viewmodel52_1
import com.awesomeapp.module_0_52.Activity52_2
import com.awesomeapp.module_0_52.Activity52_3
import com.awesomeapp.module_0_52.Fragment52_4
import com.awesomeapp.module_0_52.Repository52_5
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_0_52.Model52_8
import com.awesomeapp.module_0_52.Model52_9
import com.awesomeapp.module_0_52.Activity52_10
import com.awesomeapp.module_0_52.Model52_12
import com.awesomeapp.module_0_52.Activity52_13
import com.awesomeapp.module_0_52.Model52_15
import com.awesomeapp.module_0_52.Activity52_16
import com.awesomeapp.module_0_52.Model52_18
import com.awesomeapp.module_0_52.Activity52_19
import com.awesomeapp.module_0_52.Model52_21
import com.awesomeapp.module_0_52.Activity52_22
import com.awesomeapp.module_0_52.Model52_24
import com.awesomeapp.module_0_52.Activity52_25
import com.awesomeapp.module_0_52.Model52_27
import com.awesomeapp.module_0_52.Activity52_28
import com.awesomeapp.module_0_52.Model52_30
import com.awesomeapp.module_0_52.Activity52_31
import com.awesomeapp.module_0_52.Model52_33
import com.awesomeapp.module_0_52.Activity52_34
import com.awesomeapp.module_0_52.Model52_36
import com.awesomeapp.module_0_52.Activity52_37
import com.awesomeapp.module_0_52.Model52_39
import com.awesomeapp.module_0_52.Activity52_40
import com.awesomeapp.module_0_52.Model52_42
import com.awesomeapp.module_0_52.Activity52_43
import com.awesomeapp.module_0_52.Model52_45
import com.awesomeapp.module_0_52.Activity52_46

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(): Repository52_5 {
        return Repository52_5()
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}