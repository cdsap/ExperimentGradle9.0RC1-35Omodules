package com.awesomeapp.module_3_272.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_272.Viewmodel272_1
import com.awesomeapp.module_3_272.Activity272_2
import com.awesomeapp.module_3_272.Activity272_3
import com.awesomeapp.module_3_272.Fragment272_4
import com.awesomeapp.module_3_272.Repository272_5
import com.awesomeapp.module_2_144.Api144_6
import com.awesomeapp.module_2_156.Api156_6
import com.awesomeapp.module_2_168.Api168_6
import com.awesomeapp.module_2_208.Api208_6
import com.awesomeapp.module_2_192.Api192_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_272.Model272_8
import com.awesomeapp.module_3_272.Model272_9
import com.awesomeapp.module_3_272.Activity272_10
import com.awesomeapp.module_3_272.Model272_12
import com.awesomeapp.module_3_272.Activity272_13
import com.awesomeapp.module_3_272.Model272_15
import com.awesomeapp.module_3_272.Activity272_16
import com.awesomeapp.module_3_272.Model272_18
import com.awesomeapp.module_3_272.Activity272_19
import com.awesomeapp.module_3_272.Model272_21
import com.awesomeapp.module_3_272.Activity272_22
import com.awesomeapp.module_3_272.Model272_24
import com.awesomeapp.module_3_272.Activity272_25
import com.awesomeapp.module_3_272.Model272_27
import com.awesomeapp.module_3_272.Activity272_28
import com.awesomeapp.module_3_272.Model272_30
import com.awesomeapp.module_3_272.Activity272_31

@Module
@InstallIn(SingletonComponent::class)
object Module_272 {
    @Provides
    @Singleton
    fun provideRepository272_5(
        api0: Api144_6 = Api144_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api168_6 = Api168_6(),
        api3: Api208_6 = Api208_6(),
        api4: Api192_6 = Api192_6()
    ): Repository272_5 {
        return Repository272_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi272_6(): Api272_6 {
        return Api272_6()
    }
}