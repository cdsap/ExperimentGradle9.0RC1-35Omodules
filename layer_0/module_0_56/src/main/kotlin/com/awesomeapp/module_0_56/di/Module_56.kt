package com.awesomeapp.module_0_56.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_56.Viewmodel56_1
import com.awesomeapp.module_0_56.Activity56_2
import com.awesomeapp.module_0_56.Activity56_3
import com.awesomeapp.module_0_56.Fragment56_4
import com.awesomeapp.module_0_56.Repository56_5
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_56.Model56_8
import com.awesomeapp.module_0_56.Model56_9
import com.awesomeapp.module_0_56.Activity56_10
import com.awesomeapp.module_0_56.Model56_12
import com.awesomeapp.module_0_56.Activity56_13
import com.awesomeapp.module_0_56.Model56_15
import com.awesomeapp.module_0_56.Activity56_16
import com.awesomeapp.module_0_56.Model56_18
import com.awesomeapp.module_0_56.Activity56_19
import com.awesomeapp.module_0_56.Model56_21
import com.awesomeapp.module_0_56.Activity56_22
import com.awesomeapp.module_0_56.Model56_24
import com.awesomeapp.module_0_56.Activity56_25
import com.awesomeapp.module_0_56.Model56_27
import com.awesomeapp.module_0_56.Activity56_28
import com.awesomeapp.module_0_56.Model56_30
import com.awesomeapp.module_0_56.Activity56_31
import com.awesomeapp.module_0_56.Model56_33
import com.awesomeapp.module_0_56.Activity56_34
import com.awesomeapp.module_0_56.Model56_36
import com.awesomeapp.module_0_56.Activity56_37
import com.awesomeapp.module_0_56.Model56_39
import com.awesomeapp.module_0_56.Activity56_40

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(): Repository56_5 {
        return Repository56_5()
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}