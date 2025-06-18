package com.awesomeapp.module_3_228.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_228.Viewmodel228_1
import com.awesomeapp.module_3_228.Activity228_2
import com.awesomeapp.module_3_228.Activity228_3
import com.awesomeapp.module_3_228.Fragment228_4
import com.awesomeapp.module_3_228.Repository228_5
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_2_180.Api180_6
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_228.Usecase228_7
import com.awesomeapp.module_3_228.Model228_9
import com.awesomeapp.module_3_228.Model228_10
import com.awesomeapp.module_3_228.Activity228_11
import com.awesomeapp.module_3_228.Model228_13
import com.awesomeapp.module_3_228.Activity228_14
import com.awesomeapp.module_3_228.Model228_16
import com.awesomeapp.module_3_228.Activity228_17
import com.awesomeapp.module_3_228.Model228_19
import com.awesomeapp.module_3_228.Activity228_20
import com.awesomeapp.module_3_228.Model228_22
import com.awesomeapp.module_3_228.Activity228_23
import com.awesomeapp.module_3_228.Model228_25
import com.awesomeapp.module_3_228.Activity228_26
import com.awesomeapp.module_3_228.Model228_28
import com.awesomeapp.module_3_228.Activity228_29

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api156_6 = Api156_6(),
        api1: Api208_6 = Api208_6(),
        api2: Api144_6 = Api144_6(),
        api3: Api192_6 = Api192_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api204_6 = Api204_6(),
        api6: Api180_6 = Api180_6(),
        api7: Api160_6 = Api160_6(),
        api8: Api152_6 = Api152_6()
    ): Repository228_5 {
        return Repository228_5(api0, 
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
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}