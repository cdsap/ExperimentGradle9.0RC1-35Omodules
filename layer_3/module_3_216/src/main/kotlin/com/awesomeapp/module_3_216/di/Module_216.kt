package com.awesomeapp.module_3_216.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_216.Viewmodel216_1
import com.awesomeapp.module_3_216.Activity216_2
import com.awesomeapp.module_3_216.Activity216_3
import com.awesomeapp.module_3_216.Fragment216_4
import com.awesomeapp.module_3_216.Repository216_5
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_188.Api188_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_216.Usecase216_7
import com.awesomeapp.module_3_216.Model216_9
import com.awesomeapp.module_3_216.Model216_10
import com.awesomeapp.module_3_216.Activity216_11
import com.awesomeapp.module_3_216.Model216_13
import com.awesomeapp.module_3_216.Activity216_14

@Module
@InstallIn(SingletonComponent::class)
object Module_216 {
    @Provides
    @Singleton
    fun provideRepository216_5(
        api0: Api156_6 = Api156_6(),
        api1: Api200_6 = Api200_6(),
        api2: Api144_6 = Api144_6(),
        api3: Api164_6 = Api164_6(),
        api4: Api172_6 = Api172_6(),
        api5: Api204_6 = Api204_6(),
        api6: Api148_6 = Api148_6(),
        api7: Api176_6 = Api176_6(),
        api8: Api208_6 = Api208_6(),
        api9: Api188_6 = Api188_6(),
        api10: Api192_6 = Api192_6(),
        api11: Api180_6 = Api180_6()
    ): Repository216_5 {
        return Repository216_5(api0, 
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
    fun provideApi216_6(): Api216_6 {
        return Api216_6()
    }
}