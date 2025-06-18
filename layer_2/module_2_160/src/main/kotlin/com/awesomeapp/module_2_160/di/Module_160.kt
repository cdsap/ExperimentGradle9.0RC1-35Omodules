package com.awesomeapp.module_2_160.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_160.Viewmodel160_1
import com.awesomeapp.module_2_160.Activity160_2
import com.awesomeapp.module_2_160.Activity160_3
import com.awesomeapp.module_2_160.Fragment160_4
import com.awesomeapp.module_2_160.Repository160_5
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_160.Service160_7
import com.awesomeapp.module_2_160.Worker160_8
import com.awesomeapp.module_2_160.Model160_10
import com.awesomeapp.module_2_160.Model160_11
import com.awesomeapp.module_2_160.Activity160_12
import com.awesomeapp.module_2_160.Model160_14
import com.awesomeapp.module_2_160.Activity160_15
import com.awesomeapp.module_2_160.Model160_17
import com.awesomeapp.module_2_160.Activity160_18
import com.awesomeapp.module_2_160.Model160_20
import com.awesomeapp.module_2_160.Activity160_21
import com.awesomeapp.module_2_160.Model160_23

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api120_6 = Api120_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api140_6 = Api140_6(),
        api3: Api104_6 = Api104_6(),
        api4: Api124_6 = Api124_6(),
        api5: Api108_6 = Api108_6(),
        api6: Api116_6 = Api116_6(),
        api7: Api132_6 = Api132_6(),
        api8: Api100_6 = Api100_6(),
        api9: Api112_6 = Api112_6(),
        api10: Api92_6 = Api92_6(),
        api11: Api76_6 = Api76_6(),
        api12: Api72_6 = Api72_6(),
        api13: Api88_6 = Api88_6(),
        api14: Api128_6 = Api128_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
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
        api11, 
        api12, 
        api13, 
        api14)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}