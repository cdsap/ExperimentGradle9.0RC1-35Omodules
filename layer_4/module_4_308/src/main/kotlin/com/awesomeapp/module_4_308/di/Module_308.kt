package com.awesomeapp.module_4_308.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_308.Viewmodel308_1
import com.awesomeapp.module_4_308.Activity308_2
import com.awesomeapp.module_4_308.Activity308_3
import com.awesomeapp.module_4_308.Fragment308_4
import com.awesomeapp.module_4_308.Repository308_5
import com.awesomeapp.module_3_276.Api276_6
import com.awesomeapp.module_3_216.Api216_6
import com.awesomeapp.module_3_264.Api264_6
import com.awesomeapp.module_3_280.Api280_6
import com.awesomeapp.module_3_232.Api232_6
import com.awesomeapp.module_3_240.Api240_6
import com.awesomeapp.module_3_252.Api252_6
import com.awesomeapp.module_3_244.Api244_6
import com.awesomeapp.module_3_236.Api236_6
import com.awesomeapp.module_3_212.Api212_6
import com.awesomeapp.module_3_224.Api224_6
import com.awesomeapp.module_3_272.Api272_6
import com.awesomeapp.module_3_268.Api268_6
import com.awesomeapp.module_3_256.Api256_6
import com.awesomeapp.module_4_308.Api308_6
import com.awesomeapp.module_4_308.Model308_8
import com.awesomeapp.module_4_308.Model308_9
import com.awesomeapp.module_4_308.Activity308_10
import com.awesomeapp.module_4_308.Model308_12
import com.awesomeapp.module_4_308.Activity308_13
import com.awesomeapp.module_4_308.Model308_15
import com.awesomeapp.module_4_308.Activity308_16
import com.awesomeapp.module_4_308.Model308_18
import com.awesomeapp.module_4_308.Activity308_19
import com.awesomeapp.module_4_308.Model308_21
import com.awesomeapp.module_4_308.Activity308_22

@Module
@InstallIn(SingletonComponent::class)
object Module_308 {
    @Provides
    @Singleton
    fun provideRepository308_5(
        api0: Api276_6 = Api276_6(),
        api1: Api216_6 = Api216_6(),
        api2: Api264_6 = Api264_6(),
        api3: Api280_6 = Api280_6(),
        api4: Api232_6 = Api232_6(),
        api5: Api240_6 = Api240_6(),
        api6: Api252_6 = Api252_6(),
        api7: Api244_6 = Api244_6(),
        api8: Api236_6 = Api236_6(),
        api9: Api212_6 = Api212_6(),
        api10: Api224_6 = Api224_6(),
        api11: Api272_6 = Api272_6(),
        api12: Api268_6 = Api268_6(),
        api13: Api256_6 = Api256_6()
    ): Repository308_5 {
        return Repository308_5(api0, 
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
        api13)
    }

    @Provides
    @Singleton
    fun provideApi308_6(): Api308_6 {
        return Api308_6()
    }
}