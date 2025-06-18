package com.awesomeapp.module_0_68.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_68.Viewmodel68_1
import com.awesomeapp.module_0_68.Activity68_2
import com.awesomeapp.module_0_68.Activity68_3
import com.awesomeapp.module_0_68.Fragment68_4
import com.awesomeapp.module_0_68.Repository68_5
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_0_68.Model68_8
import com.awesomeapp.module_0_68.Model68_9
import com.awesomeapp.module_0_68.Activity68_10
import com.awesomeapp.module_0_68.Model68_12
import com.awesomeapp.module_0_68.Activity68_13
import com.awesomeapp.module_0_68.Model68_15
import com.awesomeapp.module_0_68.Activity68_16
import com.awesomeapp.module_0_68.Model68_18
import com.awesomeapp.module_0_68.Activity68_19
import com.awesomeapp.module_0_68.Model68_21
import com.awesomeapp.module_0_68.Activity68_22
import com.awesomeapp.module_0_68.Model68_24
import com.awesomeapp.module_0_68.Activity68_25
import com.awesomeapp.module_0_68.Model68_27
import com.awesomeapp.module_0_68.Activity68_28
import com.awesomeapp.module_0_68.Model68_30
import com.awesomeapp.module_0_68.Activity68_31
import com.awesomeapp.module_0_68.Model68_33
import com.awesomeapp.module_0_68.Activity68_34
import com.awesomeapp.module_0_68.Model68_36

@Module
@InstallIn(SingletonComponent::class)
object Module_68 {
    @Provides
    @Singleton
    fun provideRepository68_5(): Repository68_5 {
        return Repository68_5()
    }

    @Provides
    @Singleton
    fun provideApi68_6(): Api68_6 {
        return Api68_6()
    }
}