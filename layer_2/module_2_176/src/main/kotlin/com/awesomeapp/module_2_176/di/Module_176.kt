package com.awesomeapp.module_2_176.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_176.Viewmodel176_1
import com.awesomeapp.module_2_176.Activity176_2
import com.awesomeapp.module_2_176.Activity176_3
import com.awesomeapp.module_2_176.Fragment176_4
import com.awesomeapp.module_2_176.Repository176_5
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_176.Model176_7
import com.awesomeapp.module_2_176.Activity176_8

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api108_6 = Api108_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api80_6 = Api80_6(),
        api3: Api128_6 = Api128_6(),
        api4: Api84_6 = Api84_6(),
        api5: Api132_6 = Api132_6(),
        api6: Api116_6 = Api116_6(),
        api7: Api72_6 = Api72_6(),
        api8: Api120_6 = Api120_6(),
        api9: Api104_6 = Api104_6(),
        api10: Api76_6 = Api76_6(),
        api11: Api136_6 = Api136_6()
    ): Repository176_5 {
        return Repository176_5(api0, 
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
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}