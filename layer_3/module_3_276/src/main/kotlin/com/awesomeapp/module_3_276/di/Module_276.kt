package com.awesomeapp.module_3_276.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_276.Viewmodel276_1
import com.awesomeapp.module_3_276.Activity276_2
import com.awesomeapp.module_3_276.Activity276_3
import com.awesomeapp.module_3_276.Fragment276_4
import com.awesomeapp.module_3_276.Repository276_5
import com.awesomeapp.module_2_184.Api184_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_276.Usecase276_7
import com.awesomeapp.module_3_276.Model276_9
import com.awesomeapp.module_3_276.Model276_10
import com.awesomeapp.module_3_276.Activity276_11
import com.awesomeapp.module_3_276.Model276_13
import com.awesomeapp.module_3_276.Activity276_14
import com.awesomeapp.module_3_276.Model276_16
import com.awesomeapp.module_3_276.Activity276_17
import com.awesomeapp.module_3_276.Model276_19
import com.awesomeapp.module_3_276.Activity276_20
import com.awesomeapp.module_3_276.Model276_22
import com.awesomeapp.module_3_276.Activity276_23
import com.awesomeapp.module_3_276.Model276_25
import com.awesomeapp.module_3_276.Activity276_26
import com.awesomeapp.module_3_276.Model276_28
import com.awesomeapp.module_3_276.Activity276_29
import com.awesomeapp.module_3_276.Model276_31
import com.awesomeapp.module_3_276.Activity276_32
import com.awesomeapp.module_3_276.Model276_34
import com.awesomeapp.module_3_276.Activity276_35
import com.awesomeapp.module_3_276.Model276_37
import com.awesomeapp.module_3_276.Activity276_38
import com.awesomeapp.module_3_276.Model276_40
import com.awesomeapp.module_3_276.Activity276_41

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api184_6 = Api184_6(),
        api1: Api172_6 = Api172_6(),
        api2: Api204_6 = Api204_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api164_6 = Api164_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api144_6 = Api144_6(),
        api8: Api148_6 = Api148_6(),
        api9: Api160_6 = Api160_6(),
        api10: Api196_6 = Api196_6(),
        api11: Api168_6 = Api168_6(),
        api12: Api192_6 = Api192_6(),
        api13: Api208_6 = Api208_6(),
        api14: Api156_6 = Api156_6(),
        api15: Api188_6 = Api188_6()
    ): Repository276_5 {
        return Repository276_5(api0, 
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
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}