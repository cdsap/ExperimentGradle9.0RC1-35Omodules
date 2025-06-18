package com.awesomeapp.module_4_288.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_288.Viewmodel288_1
import com.awesomeapp.module_4_288.Activity288_2
import com.awesomeapp.module_4_288.Activity288_3
import com.awesomeapp.module_4_288.Fragment288_4
import com.awesomeapp.module_4_288.Repository288_5
import com.awesomeapp.module_3_260.Api260_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_248.Api248_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_220.Api220_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_228.Api228_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_4_288.Api288_6
import com.awesomeapp.module_4_288.Usecase288_7
import com.awesomeapp.module_4_288.Model288_9
import com.awesomeapp.module_4_288.Model288_10
import com.awesomeapp.module_4_288.Activity288_11
import com.awesomeapp.module_4_288.Model288_13
import com.awesomeapp.module_4_288.Activity288_14
import com.awesomeapp.module_4_288.Model288_16

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api260_6 = Api260_6(),
        api1: Api216_6 = Api216_6(),
        api2: Api236_6 = Api236_6(),
        api3: Api224_6 = Api224_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api276_6 = Api276_6(),
        api6: Api248_6 = Api248_6(),
        api7: Api268_6 = Api268_6(),
        api8: Api240_6 = Api240_6(),
        api9: Api244_6 = Api244_6(),
        api10: Api212_6 = Api212_6(),
        api11: Api220_6 = Api220_6(),
        api12: Api264_6 = Api264_6(),
        api13: Api228_6 = Api228_6(),
        api14: Api272_6 = Api272_6(),
        api15: Api232_6 = Api232_6(),
        api16: Api256_6 = Api256_6(),
        api17: Api252_6 = Api252_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
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
        api16, 
        api17)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}