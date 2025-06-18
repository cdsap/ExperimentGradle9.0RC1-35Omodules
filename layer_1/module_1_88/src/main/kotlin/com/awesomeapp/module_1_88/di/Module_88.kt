package com.awesomeapp.module_1_88.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_88.Viewmodel88_1
import com.awesomeapp.module_1_88.Activity88_2
import com.awesomeapp.module_1_88.Activity88_3
import com.awesomeapp.module_1_88.Fragment88_4
import com.awesomeapp.module_1_88.Repository88_5
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_56.Api56_6
import com.awesomeapp.module_0_60.Api60_6
import com.awesomeapp.module_0_48.Api48_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_88.Model88_8
import com.awesomeapp.module_1_88.Model88_9
import com.awesomeapp.module_1_88.Activity88_10
import com.awesomeapp.module_1_88.Model88_12
import com.awesomeapp.module_1_88.Activity88_13
import com.awesomeapp.module_1_88.Model88_15
import com.awesomeapp.module_1_88.Activity88_16
import com.awesomeapp.module_1_88.Model88_18
import com.awesomeapp.module_1_88.Activity88_19
import com.awesomeapp.module_1_88.Model88_21

@Module
@InstallIn(SingletonComponent::class)
object Module_88 {
    @Provides
    @Singleton
    fun provideRepository88_5(
        api0: Api44_6 = Api44_6(),
        api1: Api36_6 = Api36_6(),
        api2: Api24_6 = Api24_6(),
        api3: Api56_6 = Api56_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api48_6 = Api48_6(),
        api6: Api20_6 = Api20_6()
    ): Repository88_5 {
        return Repository88_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi88_6(): Api88_6 {
        return Api88_6()
    }
}