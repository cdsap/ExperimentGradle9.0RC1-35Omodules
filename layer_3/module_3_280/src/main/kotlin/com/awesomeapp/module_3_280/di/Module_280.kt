package com.awesomeapp.module_3_280.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_280.Viewmodel280_1
import com.awesomeapp.module_3_280.Activity280_2
import com.awesomeapp.module_3_280.Activity280_3
import com.awesomeapp.module_3_280.Fragment280_4
import com.awesomeapp.module_3_280.Repository280_5
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_280.Service280_7
import com.awesomeapp.module_3_280.Worker280_8
import com.awesomeapp.module_3_280.Model280_10
import com.awesomeapp.module_3_280.Model280_11
import com.awesomeapp.module_3_280.Activity280_12
import com.awesomeapp.module_3_280.Model280_14
import com.awesomeapp.module_3_280.Activity280_15
import com.awesomeapp.module_3_280.Model280_17
import com.awesomeapp.module_3_280.Activity280_18
import com.awesomeapp.module_3_280.Model280_20
import com.awesomeapp.module_3_280.Activity280_21
import com.awesomeapp.module_3_280.Model280_23
import com.awesomeapp.module_3_280.Activity280_24
import com.awesomeapp.module_3_280.Model280_26
import com.awesomeapp.module_3_280.Activity280_27
import com.awesomeapp.module_3_280.Model280_29
import com.awesomeapp.module_3_280.Activity280_30
import com.awesomeapp.module_3_280.Model280_32
import com.awesomeapp.module_3_280.Activity280_33
import com.awesomeapp.module_3_280.Model280_35
import com.awesomeapp.module_3_280.Activity280_36
import com.awesomeapp.module_3_280.Model280_38
import com.awesomeapp.module_3_280.Activity280_39

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(): Repository280_5 {
        return Repository280_5()
    }

    @Provides
    @Singleton
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}