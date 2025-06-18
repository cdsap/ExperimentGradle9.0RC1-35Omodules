package com.awesomeapp.module_3_268.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_268.Viewmodel268_1
import com.awesomeapp.module_3_268.Activity268_2
import com.awesomeapp.module_3_268.Activity268_3
import com.awesomeapp.module_3_268.Fragment268_4
import com.awesomeapp.module_3_268.Repository268_5
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_268.Model268_8
import com.awesomeapp.module_3_268.Model268_9
import com.awesomeapp.module_3_268.Activity268_10
import com.awesomeapp.module_3_268.Model268_12
import com.awesomeapp.module_3_268.Activity268_13

@Module
@InstallIn(SingletonComponent::class)
object Module_268 {
    @Provides
    @Singleton
    fun provideRepository268_5(
        api0: Api160_6 = Api160_6(),
        api1: Api200_6 = Api200_6(),
        api2: Api196_6 = Api196_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api188_6 = Api188_6(),
        api5: Api176_6 = Api176_6(),
        api6: Api152_6 = Api152_6(),
        api7: Api164_6 = Api164_6(),
        api8: Api168_6 = Api168_6(),
        api9: Api184_6 = Api184_6(),
        api10: Api172_6 = Api172_6(),
        api11: Api180_6 = Api180_6(),
        api12: Api144_6 = Api144_6()
    ): Repository268_5 {
        return Repository268_5(api0, 
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
        api12)
    }

    @Provides
    @Singleton
    fun provideApi268_6(): Api268_6 {
        return Api268_6()
    }
}