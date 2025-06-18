package com.awesomeapp.module_1_116.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_116.Viewmodel116_1
import com.awesomeapp.module_1_116.Activity116_2
import com.awesomeapp.module_1_116.Activity116_3
import com.awesomeapp.module_1_116.Fragment116_4
import com.awesomeapp.module_1_116.Repository116_5
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_116.Model116_8
import com.awesomeapp.module_1_116.Model116_9
import com.awesomeapp.module_1_116.Activity116_10
import com.awesomeapp.module_1_116.Model116_12
import com.awesomeapp.module_1_116.Activity116_13
import com.awesomeapp.module_1_116.Model116_15
import com.awesomeapp.module_1_116.Activity116_16

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api40_6 = Api40_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api48_6 = Api48_6(),
        api5: Api32_6 = Api32_6(),
        api6: Api44_6 = Api44_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}