package com.awesomeapp.module_4_348.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_348.Viewmodel348_1
import com.awesomeapp.module_4_348.Activity348_2
import com.awesomeapp.module_4_348.Activity348_3
import com.awesomeapp.module_4_348.Fragment348_4
import com.awesomeapp.module_4_348.Repository348_5
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_4_348.Api348_6
import com.awesomeapp.module_4_348.Usecase348_7
import com.awesomeapp.module_4_348.Model348_9
import com.awesomeapp.module_4_348.Model348_10
import com.awesomeapp.module_4_348.Activity348_11
import com.awesomeapp.module_4_348.Model348_13
import com.awesomeapp.module_4_348.Activity348_14
import com.awesomeapp.module_4_348.Model348_16
import com.awesomeapp.module_4_348.Activity348_17
import com.awesomeapp.module_4_348.Model348_19
import com.awesomeapp.module_4_348.Activity348_20
import com.awesomeapp.module_4_348.Model348_22
import com.awesomeapp.module_4_348.Activity348_23
import com.awesomeapp.module_4_348.Model348_25
import com.awesomeapp.module_4_348.Activity348_26
import com.awesomeapp.module_4_348.Model348_28
import com.awesomeapp.module_4_348.Activity348_29
import com.awesomeapp.module_4_348.Model348_31
import com.awesomeapp.module_4_348.Activity348_32
import com.awesomeapp.module_4_348.Model348_34
import com.awesomeapp.module_4_348.Activity348_35
import com.awesomeapp.module_4_348.Model348_37
import com.awesomeapp.module_4_348.Activity348_38
import com.awesomeapp.module_4_348.Model348_40
import com.awesomeapp.module_4_348.Activity348_41
import com.awesomeapp.module_4_348.Model348_43
import com.awesomeapp.module_4_348.Activity348_44
import com.awesomeapp.module_4_348.Model348_46
import com.awesomeapp.module_4_348.Activity348_47

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api276_6 = Api276_6(),
        api1: Api232_6 = Api232_6(),
        api2: Api240_6 = Api240_6(),
        api3: Api236_6 = Api236_6(),
        api4: Api256_6 = Api256_6(),
        api5: Api280_6 = Api280_6(),
        api6: Api220_6 = Api220_6(),
        api7: Api252_6 = Api252_6(),
        api8: Api248_6 = Api248_6(),
        api9: Api272_6 = Api272_6(),
        api10: Api244_6 = Api244_6(),
        api11: Api224_6 = Api224_6(),
        api12: Api264_6 = Api264_6(),
        api13: Api260_6 = Api260_6(),
        api14: Api216_6 = Api216_6(),
        api15: Api268_6 = Api268_6(),
        api16: Api228_6 = Api228_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
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
        api15, 
        api16)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}