package com.awesomeapp.module_0_20.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_20.Viewmodel20_1
import com.awesomeapp.module_0_20.Activity20_2
import com.awesomeapp.module_0_20.Activity20_3
import com.awesomeapp.module_0_20.Fragment20_4
import com.awesomeapp.module_0_20.Repository20_5
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_20.Service20_7
import com.awesomeapp.module_0_20.Worker20_8
import com.awesomeapp.module_0_20.Model20_10
import com.awesomeapp.module_0_20.Model20_11
import com.awesomeapp.module_0_20.Activity20_12
import com.awesomeapp.module_0_20.Model20_14
import com.awesomeapp.module_0_20.Activity20_15
import com.awesomeapp.module_0_20.Model20_17
import com.awesomeapp.module_0_20.Activity20_18
import com.awesomeapp.module_0_20.Model20_20
import com.awesomeapp.module_0_20.Activity20_21
import com.awesomeapp.module_0_20.Model20_23
import com.awesomeapp.module_0_20.Activity20_24
import com.awesomeapp.module_0_20.Model20_26
import com.awesomeapp.module_0_20.Activity20_27
import com.awesomeapp.module_0_20.Model20_29
import com.awesomeapp.module_0_20.Activity20_30
import com.awesomeapp.module_0_20.Model20_32
import com.awesomeapp.module_0_20.Activity20_33
import com.awesomeapp.module_0_20.Model20_35
import com.awesomeapp.module_0_20.Activity20_36
import com.awesomeapp.module_0_20.Model20_38
import com.awesomeapp.module_0_20.Activity20_39
import com.awesomeapp.module_0_20.Model20_41
import com.awesomeapp.module_0_20.Activity20_42
import com.awesomeapp.module_0_20.Model20_44
import com.awesomeapp.module_0_20.Activity20_45

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideRepository20_5(): Repository20_5 {
        return Repository20_5()
    }

    @Provides
    @Singleton
    fun provideApi20_6(): Api20_6 {
        return Api20_6()
    }
}