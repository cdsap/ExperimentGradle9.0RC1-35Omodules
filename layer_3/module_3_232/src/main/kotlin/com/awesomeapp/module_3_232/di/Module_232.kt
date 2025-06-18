package com.awesomeapp.module_3_232.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_232.Viewmodel232_1
import com.awesomeapp.module_3_232.Activity232_2
import com.awesomeapp.module_3_232.Activity232_3
import com.awesomeapp.module_3_232.Fragment232_4
import com.awesomeapp.module_3_232.Repository232_5
import com.awesomeapp.module_2_176.Api176_6
import com.awesomeapp.module_2_196.Api196_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_164.Api164_6
import com.awesomeapp.module_2_200.Api200_6
import com.awesomeapp.module_2_152.Api152_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_232.Model232_8
import com.awesomeapp.module_3_232.Model232_9
import com.awesomeapp.module_3_232.Activity232_10
import com.awesomeapp.module_3_232.Model232_12
import com.awesomeapp.module_3_232.Activity232_13
import com.awesomeapp.module_3_232.Model232_15
import com.awesomeapp.module_3_232.Activity232_16
import com.awesomeapp.module_3_232.Model232_18
import com.awesomeapp.module_3_232.Activity232_19
import com.awesomeapp.module_3_232.Model232_21
import com.awesomeapp.module_3_232.Activity232_22
import com.awesomeapp.module_3_232.Model232_24
import com.awesomeapp.module_3_232.Activity232_25

@Module
@InstallIn(SingletonComponent::class)
object Module_232 {
    @Provides
    @Singleton
    fun provideRepository232_5(
        api0: Api176_6 = Api176_6(),
        api1: Api196_6 = Api196_6(),
        api2: Api168_6 = Api168_6(),
        api3: Api164_6 = Api164_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api152_6 = Api152_6(),
        api6: Api208_6 = Api208_6()
    ): Repository232_5 {
        return Repository232_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi232_6(): Api232_6 {
        return Api232_6()
    }
}