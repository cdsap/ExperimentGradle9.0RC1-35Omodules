package com.awesomeapp.module_1_104.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_104.Viewmodel104_1
import com.awesomeapp.module_1_104.Activity104_2
import com.awesomeapp.module_1_104.Activity104_3
import com.awesomeapp.module_1_104.Fragment104_4
import com.awesomeapp.module_1_104.Repository104_5
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_64.Api64_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_104.Model104_7
import com.awesomeapp.module_1_104.Activity104_8

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api12_6 = Api12_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api52_6 = Api52_6()
    ): Repository104_5 {
        return Repository104_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}