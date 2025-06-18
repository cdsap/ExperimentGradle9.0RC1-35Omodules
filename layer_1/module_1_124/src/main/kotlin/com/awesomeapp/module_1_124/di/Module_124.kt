package com.awesomeapp.module_1_124.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_124.Viewmodel124_1
import com.awesomeapp.module_1_124.Activity124_2
import com.awesomeapp.module_1_124.Activity124_3
import com.awesomeapp.module_1_124.Fragment124_4
import com.awesomeapp.module_1_124.Repository124_5
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_52.Api52_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_68.Api68_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_124.Model124_8
import com.awesomeapp.module_1_124.Model124_9
import com.awesomeapp.module_1_124.Activity124_10
import com.awesomeapp.module_1_124.Model124_12
import com.awesomeapp.module_1_124.Activity124_13
import com.awesomeapp.module_1_124.Model124_15
import com.awesomeapp.module_1_124.Activity124_16

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api4_6 = Api4_6(),
        api1: Api60_6 = Api60_6(),
        api2: Api56_6 = Api56_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api52_6 = Api52_6(),
        api5: Api48_6 = Api48_6(),
        api6: Api68_6 = Api68_6(),
        api7: Api20_6 = Api20_6(),
        api8: Api32_6 = Api32_6(),
        api9: Api40_6 = Api40_6(),
        api10: Api28_6 = Api28_6(),
        api11: Api8_6 = Api8_6()
    ): Repository124_5 {
        return Repository124_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}