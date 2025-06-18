package com.awesomeapp.module_4_300.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_300.Viewmodel300_1
import com.awesomeapp.module_4_300.Activity300_2
import com.awesomeapp.module_4_300.Activity300_3
import com.awesomeapp.module_4_300.Fragment300_4
import com.awesomeapp.module_4_300.Repository300_5
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_4_300.Api300_6
import com.awesomeapp.module_4_300.Service300_7
import com.awesomeapp.module_4_300.Worker300_8
import com.awesomeapp.module_4_300.Usecase300_9
import com.awesomeapp.module_4_300.Model300_11
import com.awesomeapp.module_4_300.Model300_12
import com.awesomeapp.module_4_300.Activity300_13
import com.awesomeapp.module_4_300.Model300_15
import com.awesomeapp.module_4_300.Activity300_16
import com.awesomeapp.module_4_300.Model300_18
import com.awesomeapp.module_4_300.Activity300_19
import com.awesomeapp.module_4_300.Model300_21
import com.awesomeapp.module_4_300.Activity300_22
import com.awesomeapp.module_4_300.Model300_24
import com.awesomeapp.module_4_300.Activity300_25
import com.awesomeapp.module_4_300.Model300_27
import com.awesomeapp.module_4_300.Activity300_28
import com.awesomeapp.module_4_300.Model300_30
import com.awesomeapp.module_4_300.Activity300_31
import com.awesomeapp.module_4_300.Model300_33
import com.awesomeapp.module_4_300.Activity300_34
import com.awesomeapp.module_4_300.Model300_36
import com.awesomeapp.module_4_300.Activity300_37
import com.awesomeapp.module_4_300.Model300_39
import com.awesomeapp.module_4_300.Activity300_40

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api248_6 = Api248_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api236_6 = Api236_6(),
        api3: Api276_6 = Api276_6(),
        api4: Api264_6 = Api264_6(),
        api5: Api268_6 = Api268_6(),
        api6: Api240_6 = Api240_6(),
        api7: Api280_6 = Api280_6(),
        api8: Api228_6 = Api228_6(),
        api9: Api260_6 = Api260_6(),
        api10: Api212_6 = Api212_6(),
        api11: Api232_6 = Api232_6(),
        api12: Api216_6 = Api216_6(),
        api13: Api220_6 = Api220_6(),
        api14: Api244_6 = Api244_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
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
        api14)
    }

    @Provides
    @Singleton
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}