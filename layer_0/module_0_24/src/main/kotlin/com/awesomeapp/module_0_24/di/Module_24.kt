package com.awesomeapp.module_0_24.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_24.Viewmodel24_1
import com.awesomeapp.module_0_24.Activity24_2
import com.awesomeapp.module_0_24.Activity24_3
import com.awesomeapp.module_0_24.Fragment24_4
import com.awesomeapp.module_0_24.Repository24_5
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_24.Usecase24_7
import com.awesomeapp.module_0_24.Model24_9
import com.awesomeapp.module_0_24.Model24_10
import com.awesomeapp.module_0_24.Activity24_11
import com.awesomeapp.module_0_24.Model24_13
import com.awesomeapp.module_0_24.Activity24_14
import com.awesomeapp.module_0_24.Model24_16
import com.awesomeapp.module_0_24.Activity24_17
import com.awesomeapp.module_0_24.Model24_19
import com.awesomeapp.module_0_24.Activity24_20
import com.awesomeapp.module_0_24.Model24_22
import com.awesomeapp.module_0_24.Activity24_23
import com.awesomeapp.module_0_24.Model24_25
import com.awesomeapp.module_0_24.Activity24_26
import com.awesomeapp.module_0_24.Model24_28
import com.awesomeapp.module_0_24.Activity24_29
import com.awesomeapp.module_0_24.Model24_31
import com.awesomeapp.module_0_24.Activity24_32
import com.awesomeapp.module_0_24.Model24_34
import com.awesomeapp.module_0_24.Activity24_35
import com.awesomeapp.module_0_24.Model24_37
import com.awesomeapp.module_0_24.Activity24_38
import com.awesomeapp.module_0_24.Model24_40
import com.awesomeapp.module_0_24.Activity24_41
import com.awesomeapp.module_0_24.Model24_43
import com.awesomeapp.module_0_24.Activity24_44
import com.awesomeapp.module_0_24.Model24_46
import com.awesomeapp.module_0_24.Activity24_47

@Module
@InstallIn(SingletonComponent::class)
object Module_24 {
    @Provides
    @Singleton
    fun provideRepository24_5(): Repository24_5 {
        return Repository24_5()
    }

    @Provides
    @Singleton
    fun provideApi24_6(): Api24_6 {
        return Api24_6()
    }
}