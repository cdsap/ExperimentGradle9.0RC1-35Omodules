package com.awesomeapp.module_3_240.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_240.Viewmodel240_1
import com.awesomeapp.module_3_240.Activity240_2
import com.awesomeapp.module_3_240.Activity240_3
import com.awesomeapp.module_3_240.Fragment240_4
import com.awesomeapp.module_3_240.Repository240_5
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_240.Service240_7
import com.awesomeapp.module_3_240.Worker240_8
import com.awesomeapp.module_3_240.Usecase240_9
import com.awesomeapp.module_3_240.Model240_11
import com.awesomeapp.module_3_240.Model240_12
import com.awesomeapp.module_3_240.Activity240_13
import com.awesomeapp.module_3_240.Model240_15
import com.awesomeapp.module_3_240.Activity240_16
import com.awesomeapp.module_3_240.Model240_18
import com.awesomeapp.module_3_240.Activity240_19

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api156_6 = Api156_6(),
        api1: Api152_6 = Api152_6(),
        api2: Api184_6 = Api184_6(),
        api3: Api168_6 = Api168_6(),
        api4: Api148_6 = Api148_6(),
        api5: Api172_6 = Api172_6(),
        api6: Api180_6 = Api180_6(),
        api7: Api196_6 = Api196_6(),
        api8: Api164_6 = Api164_6(),
        api9: Api176_6 = Api176_6(),
        api10: Api208_6 = Api208_6(),
        api11: Api192_6 = Api192_6(),
        api12: Api200_6 = Api200_6(),
        api13: Api204_6 = Api204_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
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
        api13)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}