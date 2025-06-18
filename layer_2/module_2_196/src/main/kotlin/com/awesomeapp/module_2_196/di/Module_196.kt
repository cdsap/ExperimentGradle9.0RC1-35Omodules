package com.awesomeapp.module_2_196.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_196.Viewmodel196_1
import com.awesomeapp.module_2_196.Activity196_2
import com.awesomeapp.module_2_196.Activity196_3
import com.awesomeapp.module_2_196.Fragment196_4
import com.awesomeapp.module_2_196.Repository196_5
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_196.Model196_7
import com.awesomeapp.module_2_196.Activity196_8

@Module
@InstallIn(SingletonComponent::class)
object Module_196 {
    @Provides
    @Singleton
    fun provideRepository196_5(
        api0: Api84_6 = Api84_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api120_6 = Api120_6(),
        api3: Api108_6 = Api108_6(),
        api4: Api128_6 = Api128_6(),
        api5: Api140_6 = Api140_6(),
        api6: Api112_6 = Api112_6(),
        api7: Api92_6 = Api92_6(),
        api8: Api80_6 = Api80_6()
    ): Repository196_5 {
        return Repository196_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi196_6(): Api196_6 {
        return Api196_6()
    }
}