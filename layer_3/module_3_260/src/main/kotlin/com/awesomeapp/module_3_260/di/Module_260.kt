package com.awesomeapp.module_3_260.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_260.Viewmodel260_1
import com.awesomeapp.module_3_260.Activity260_2
import com.awesomeapp.module_3_260.Activity260_3
import com.awesomeapp.module_3_260.Fragment260_4
import com.awesomeapp.module_3_260.Repository260_5
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_148.Api148_6
import com.awesomeapp.module_2_160.Api160_6
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_2_172.Api172_6
import com.awesomeapp.module_2_204.Api204_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_260.Service260_7
import com.awesomeapp.module_3_260.Worker260_8
import com.awesomeapp.module_3_260.Model260_10
import com.awesomeapp.module_3_260.Model260_11

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api196_6 = Api196_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api208_6 = Api208_6(),
        api3: Api152_6 = Api152_6(),
        api4: Api148_6 = Api148_6(),
        api5: Api160_6 = Api160_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api144_6 = Api144_6(),
        api8: Api192_6 = Api192_6(),
        api9: Api172_6 = Api172_6(),
        api10: Api204_6 = Api204_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}