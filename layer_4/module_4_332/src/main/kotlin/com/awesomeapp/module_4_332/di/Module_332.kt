package com.awesomeapp.module_4_332.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_332.Viewmodel332_1
import com.awesomeapp.module_4_332.Activity332_2
import com.awesomeapp.module_4_332.Activity332_3
import com.awesomeapp.module_4_332.Fragment332_4
import com.awesomeapp.module_4_332.Repository332_5
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_4_332.Api332_6
import com.awesomeapp.module_4_332.Model332_8
import com.awesomeapp.module_4_332.Model332_9
import com.awesomeapp.module_4_332.Activity332_10
import com.awesomeapp.module_4_332.Model332_12
import com.awesomeapp.module_4_332.Activity332_13
import com.awesomeapp.module_4_332.Model332_15
import com.awesomeapp.module_4_332.Activity332_16
import com.awesomeapp.module_4_332.Model332_18
import com.awesomeapp.module_4_332.Activity332_19
import com.awesomeapp.module_4_332.Model332_21
import com.awesomeapp.module_4_332.Activity332_22
import com.awesomeapp.module_4_332.Model332_24
import com.awesomeapp.module_4_332.Activity332_25
import com.awesomeapp.module_4_332.Model332_27
import com.awesomeapp.module_4_332.Activity332_28

@Module
@InstallIn(SingletonComponent::class)
object Module_332 {
    @Provides
    @Singleton
    fun provideRepository332_5(
        api0: Api244_6 = Api244_6(),
        api1: Api220_6 = Api220_6(),
        api2: Api272_6 = Api272_6(),
        api3: Api280_6 = Api280_6(),
        api4: Api212_6 = Api212_6(),
        api5: Api264_6 = Api264_6(),
        api6: Api232_6 = Api232_6(),
        api7: Api224_6 = Api224_6(),
        api8: Api240_6 = Api240_6()
    ): Repository332_5 {
        return Repository332_5(api0, 
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
    fun provideApi332_6(): Api332_6 {
        return Api332_6()
    }
}