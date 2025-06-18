package com.awesomeapp.module_2_148.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_148.Viewmodel148_1
import com.awesomeapp.module_2_148.Activity148_2
import com.awesomeapp.module_2_148.Activity148_3
import com.awesomeapp.module_2_148.Fragment148_4
import com.awesomeapp.module_2_148.Repository148_5
import com.awesomeapp.module_1_128.Api128_6
import com.awesomeapp.module_1_100.Api100_6
import com.awesomeapp.module_1_112.Api112_6
import com.awesomeapp.module_1_140.Api140_6
import com.awesomeapp.module_1_136.Api136_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_132.Api132_6
import com.awesomeapp.module_1_124.Api124_6
import com.awesomeapp.module_1_116.Api116_6
import com.awesomeapp.module_1_96.Api96_6
import com.awesomeapp.module_1_108.Api108_6
import com.awesomeapp.module_1_120.Api120_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_104.Api104_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_148.Model148_7
import com.awesomeapp.module_2_148.Activity148_8

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api128_6 = Api128_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api112_6 = Api112_6(),
        api3: Api140_6 = Api140_6(),
        api4: Api136_6 = Api136_6(),
        api5: Api88_6 = Api88_6(),
        api6: Api80_6 = Api80_6(),
        api7: Api132_6 = Api132_6(),
        api8: Api124_6 = Api124_6(),
        api9: Api116_6 = Api116_6(),
        api10: Api96_6 = Api96_6(),
        api11: Api108_6 = Api108_6(),
        api12: Api120_6 = Api120_6(),
        api13: Api72_6 = Api72_6(),
        api14: Api76_6 = Api76_6(),
        api15: Api104_6 = Api104_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
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
        api14, 
        api15)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}